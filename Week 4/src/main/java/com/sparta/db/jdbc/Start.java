package com.sparta.db.jdbc;

public class Start {
    public static void main(String[] args) {
        UserDao userDao = new UserDao(ConnectionManager.getConnection());
        userDao.getAllUsers();
        userDao.createRecord("Neil", "2020-12-12");
        userDao.getAllUsers();
        ConnectionManager.closeConnection();
    }
}
