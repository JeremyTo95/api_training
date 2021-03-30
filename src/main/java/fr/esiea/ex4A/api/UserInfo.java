package fr.esiea.ex4A.api;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;

import java.util.LinkedHashMap;

public class UserInfo {
    public final String email;
    public final String name;
    public final String twitter;
    public final String country;
    public final String sex;
    public final String sexPref;

    public UserInfo(String userEmail, String userName, String userTweetter, String userCountry, String userSex, String userSexPref) {
        this.email   = userEmail;
        this.name    = userName;
        this.twitter = userTweetter;
        this.country = userCountry;
        this.sex     = userSex;
        this.sexPref = userSexPref;
    }

    public UserInfo(String jsonString) throws ParseException {
        JSONParser parser = new JSONParser(jsonString);
        LinkedHashMap<String, Object> json = parser.object();
        this.email   = json.get("userEmail").toString();
        this.name    = json.get("userName").toString();
        this.twitter = json.get("userTweeter").toString();
        this.country = json.get("userCountry").toString();
        this.sex     = json.get("userSex").toString();
        this.sexPref = json.get("userSexPref").toString();
    }
}
