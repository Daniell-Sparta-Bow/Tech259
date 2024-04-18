package com.sparta.db.static_and_final;

// if final is added on a class it can not be inherited further. This class is non-inheritable
// String class is an example of a String class
public class FinalExample {
    // Final on a field
    private final int score = 100;

    // Final on a method
    public final int getScore(){
        return score;
    }

}
