package com.sparta.db.generics;

public class GenericRectangle <T> { // T stands for Type
    private T width;
    private T height;

    public GenericRectangle(T width, T height) {
        this.width = width;
        this.height = height;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public <T extends Number> boolean isSquare(T width, T height){

        return width.equals(height);
    }

}
