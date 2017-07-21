package gpms.rest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author Anthony Luo
 * validates if a given credential is valid or invalid with conformance to the 2017 NIST Standards
 * @value BLACKLISTFILE the name of the password blacklist file

 */


public class GPMSPasswordValidation {
    public HashMap<String, String> blacklist;
    String BLACKLISTFILE = new String();
    boolean blacklistparsed = false;
    private final String BLACKLISTNAME = "blacklistpassword.txt";
    StringSimilarity similar = new StringSimilarity();

    public enum validity {
        VALID, BLACKLISTED, SIMILAR
    }


    public GPMSPasswordValidation() {
    }


    /**
     * sets the location of the password blacklist so it can be parsed
     * @param filepath the filepath of the folder which contains the blacklist
     */
    public void setFilePath(String filepath){
        BLACKLISTFILE = filepath + BLACKLISTNAME;
        if(!blacklistparsed){
            this.blacklist = loadBlacklist();
        }
    }

    /**
     * checks credentials for conformance to the 2017 NIST Standards
     * @param user the username to be checked
     * @param pass the password to be checked
     * @return returns an enum of the validity of the password
     */
    public validity isCredentialValidEnum(String user, String pass){
        if(isPasswordsimilartoUsername(user,pass)){
            return validity.SIMILAR;
        }
        else if(!isPasswordBlacklisted(pass)){
            return validity.BLACKLISTED;
        }
        return validity.VALID;
    }

    /**
     * checks if a given password is blacklisted
     * @param pass the password to be checked
     * @return returns true if the password is blacklisted, false if the password is not on the password blacklist.
     */
    public boolean isPasswordBlacklisted(String pass) {
        pass = pass.replaceAll("\\s+", "").toLowerCase();
        return !(blacklist.containsValue(pass));
    }

    /**
     * checks if the username is similar to the password using the Levenshtein Edit Distance Formula found in the StringSimilarity class
     * @param user the username to be checked
     * @param pass the password to be checked
     * @return returns true if too similar, false if it is not too similar
     */
    public boolean isPasswordsimilartoUsername(String user, String pass) {
        pass = pass.replaceAll("\\s+", "");
        return (similar.similarity(user, pass) > 0.7);
    }

    private HashMap loadBlacklist() {
        HashMap<String, String> map = new HashMap<String, String>();
        try {
            BufferedReader input = new BufferedReader(new FileReader(BLACKLISTFILE));
            String line = "";
            while ((line = input.readLine()) != null) {
                if (line.length() > 7) {
                    map.put(line, line);
                }

            }
            input.close();
            blacklistparsed = true;

        } catch (IOException e) {
            System.out.println("File is not found");
        }
        return map;

    }
}