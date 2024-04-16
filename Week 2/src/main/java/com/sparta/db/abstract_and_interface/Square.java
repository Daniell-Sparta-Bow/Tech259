package com.sparta.db.abstract_and_interface;

public class Square extends Shape {
    public Square(int length, int width) {
        super(length, width);
    }
    //@Override
    public int getArea(){
        return getLength() * getWidth();
    }
}
