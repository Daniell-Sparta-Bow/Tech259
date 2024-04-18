package com.sparta.db.static_and_final;

import java.util.ArrayList;

public class StaticExample {
    private static ArrayList<String> names = new ArrayList<>();

    // Static only run the first time the class is loaded
    static {
        names.add("Manish");
        names.add("Gary");
    }

    // Instance Block runs everytime an instance is created, Sometimes referred to as a initializer block
    {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        System.out.println(names);
    }
}
