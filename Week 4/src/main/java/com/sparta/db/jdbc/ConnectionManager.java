package com.sparta.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static Connection connection;

    private static void setUp(){
        PropertiesUtil.setUp();
        try {
            connection = DriverManager.getConnection(
                    PropertiesUtil.getUrl(),
                    PropertiesUtil.getUsername(),
                    PropertiesUtil.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        if (connection == null){
            setUp();
        }
        return connection;
    }




    public static void closeConnection() {
        try{
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
