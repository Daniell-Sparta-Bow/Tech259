package com.sparta.db.exceptions;

import java.io.FileReader;
import java.rmi.AlreadyBoundException;

public class App {
    public static void main(String[] args){
        //FileReader reader = new FileReader("file");
        try {
            NameChecker.getLengthOfName(null);
        } catch (AlreadyBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
