package com.sparta.db.jdbc;

import java.sql.*;
import java.time.LocalDate;

public class UserDao {

    private Connection connection;
    public void createRecord(String name, String dateOfBirth) {
        LocalDate sanitizedDateOfBirth = SQLTypeConverter.getStringToDate(dateOfBirth);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Queryable.CREATE_RECORD);
            preparedStatement.setString(1, name);
            preparedStatement.setDate(2, Date.valueOf(sanitizedDateOfBirth));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getAllUsers() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Queryable.GET_ALL_USERS);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getDate(3).toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public UserDao(Connection connection) {
        this.connection = connection;
    }
}
