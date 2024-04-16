package com.sparta.db.abstract_and_interface;

public class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    //@Override
    public int getArea(){
        return getLength() * getWidth();
    }
}
