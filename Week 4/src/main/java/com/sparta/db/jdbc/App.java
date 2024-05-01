package com.sparta.db.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class App {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/database.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        try (Connection connection = DriverManager.getConnection(
                url,
                username,
                password
        )){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getDate(3));
            }

            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where name like ?");
            preparedStatement.setString(1, "A%");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
