package gpms.DAL;

import org.apache.log4j.Logger;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

/***
 * MongoDBConnector providing the database connection.
 * 
 * @author milsonmunakami
 *
 */
public class MongoDBConnector {
	private static final Logger logger = Logger
			.getLogger(MongoDBConnector.class.getName());

	public static final String DB_NAME = "db_gpms";

	private static final String host = "localhost";
	private static final int port = 27017;

	private static MongoClient mongo = null;

	static Mongo connection = null;
	static DB db = null;
	static DB mdb = null;

	/***
	 * Creates MongoDB Client
	 * 
	 * @return
	 */
	public static MongoClient getMongo() {
		if (mongo == null) {
			try {
				mongo = new MongoClient(host, port);
				logger.debug("New MongoDB Connection created with [" + host
						+ "] and [" + port + "]");
			} catch (MongoException e) {
				logger.error(e.getMessage());
			}
		}
		return mongo;
	}

	// Vulnerable function
	public static DBCursor findUser(String collName, String username, String pwd) {
		mdb = mongo.getDB(DB_NAME);
		DBCollection coll = mdb.getCollection(collName);
		String query = "{ username : '" + username + "' , password: '" + pwd
				+ "' }";
		DBObject qObject = (DBObject) JSON.parse(query);
		DBCursor cursor = coll.find(qObject);
		return cursor;
	}

	// Vulnerable function
	public static DBCursor findWhere(String collName, String key, String val) {
		mdb = mongo.getDB(DB_NAME);
		DBCollection coll = mdb.getCollection(collName);
		String query = "{ $where : \"this. " + key + " == " + val + "\" }";
		DBObject qObject = (DBObject) JSON.parse(query);
		DBCursor cursor = coll.find(qObject);
		return cursor;
	}

	// Vulnerable function
	public static DBCursor findOne(String collName, String key, String val) {
		mdb = mongo.getDB(DB_NAME);
		DBCollection coll = mdb.getCollection(collName);
		String query = "{ key:  '" + val + "'\" }";
		DBObject qObject = (DBObject) JSON.parse(query);
		DBCursor cursor = coll.find(qObject);
		return cursor;
	}

	// Vulnerable function
	@SuppressWarnings("deprecation")
	public static int update(String collName, String id, String pwd) {
		mdb = mongo.getDB(DB_NAME);
		DBCollection coll = mdb.getCollection(collName);

		DBObject idObject = (DBObject) JSON
				.parse("{'username' : '" + id + "'}");
		String query = "{$set: {'password': '" + pwd + "'}}";
		DBObject qObject = (DBObject) JSON.parse(query);
		return coll.update(idObject, qObject).getN();

	}
}
