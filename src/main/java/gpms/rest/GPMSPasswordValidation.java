package gpms.rest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by anthonyluo on 7/17/17.
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

    public void setFilePath(String filepath){
        BLACKLISTFILE = filepath + BLACKLISTNAME;
        if(!blacklistparsed){
            this.blacklist = loadBlacklist();
        }
    }


    public validity isCredentialValidEnum(String user, String pass){
        if(isPasswordsimilartoUsername(user,pass)){
            return validity.SIMILAR;
        }
        else if(!isPasswordBlacklisted(pass)){
            return validity.BLACKLISTED;
        }
        return validity.VALID;
    }


    public boolean isPasswordBlacklisted(String pass) {
        pass = pass.replaceAll("\\s+", "").toLowerCase();
        return !(blacklist.containsValue(pass));
    }


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