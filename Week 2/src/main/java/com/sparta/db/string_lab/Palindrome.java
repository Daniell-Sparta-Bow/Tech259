package com.sparta.db.string_lab;

public class Palindrome {


    public static boolean isPalindrome(String inputString){
        if (!isMoreThan3CharsLong(inputString)){
            return false;
        }
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        builder1.append(inputString.toLowerCase());
        builder2.append(inputString.toLowerCase()).reverse();



        return builder1.compareTo(builder2) == 0;

    }

    public static String getLargestPalindrome(String[] palindromeList){
        StringBuilder biggestPalindrome = new StringBuilder();
        biggestPalindrome.append("");
        for(String string : palindromeList){
            if (isPalindrome(string) && biggestPalindrome.length()<string.length()){
                biggestPalindrome.delete(0, biggestPalindrome.length());
                biggestPalindrome.append(string);
            }
        }
        return biggestPalindrome.toString();
    }

    private static boolean isMoreThan3CharsLong(String inputString){
        return inputString.length() >= 3;
    }

}
