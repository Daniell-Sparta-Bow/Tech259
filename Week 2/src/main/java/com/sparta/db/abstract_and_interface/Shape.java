package com.sparta.db.abstract_and_interface;

public abstract class Shape implements AreaGetable {
    // abstract classes are used to define general state and behaviour

    private int length;
    private int width;

    public Shape() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //public abstract int getArea();


    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
