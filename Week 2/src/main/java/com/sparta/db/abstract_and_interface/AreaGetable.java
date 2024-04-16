package com.sparta.db.abstract_and_interface;

public interface AreaGetable {
    public static final int MAX_SIZE = 100;
    public abstract int getArea();

    public default int getSize(){
        return 5;
    }

    private int calculateSize(){
        return 10;
    }

    public static int getMinSize(){
        return 165;
    }
}
