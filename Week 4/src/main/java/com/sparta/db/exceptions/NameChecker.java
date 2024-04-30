package com.sparta.db.exceptions;

import java.rmi.AlreadyBoundException;

public class NameChecker {
    public static int getLengthOfName(String name) throws AlreadyBoundException {
        if (name == null){
            throw new AlreadyBoundException("Name should not be null: " + name);
        }else{
            return name.length();
        }
    }
}
