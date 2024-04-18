package com.sparta.db.strings;

public class StringExample {
    public static void main(String[] args) {
        String name = "Manish";
        String lowerCase = name.toLowerCase();
        System.out.println(name);
        System.out.println(lowerCase);
        System.out.println(reverseString(name));
    }

    public static String reverseString(String stringToReverse){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringToReverse);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
