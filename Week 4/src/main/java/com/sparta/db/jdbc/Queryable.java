package com.sparta.db.jdbc;

public interface Queryable {
    String CREATE_RECORD = "INSERT INTO users (name, date_of_birth) VALUES (?,?)";
    String GET_ALL_USERS = "SELECT * FROM users";
}
