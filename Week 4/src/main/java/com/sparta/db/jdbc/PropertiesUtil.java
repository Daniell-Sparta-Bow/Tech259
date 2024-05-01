package com.sparta.db.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties properties = new Properties();


    public static void setUp(){
        try {
            properties.load(new FileReader("src/main/resources/database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl(){
        return properties.getProperty("url");
    }
    public static String getUsername(){
        return properties.getProperty("username");
    }
    public static String getPassword(){
        return properties.getProperty("password");
    }
}
