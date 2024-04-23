package com.sparta.db.generics;

public class App {
    public static void main(String[] args) {
        IntegerRectangle integerRectangle = new IntegerRectangle(2, 4);
        DoubleRectangle doubleRectangle = new DoubleRectangle(10.5, 4.2);
        ObjectRectangle objectRectangle = new ObjectRectangle(10, 12);
        GenericRectangle<Integer> genericRectangle = new GenericRectangle<>(15, 4);

        System.out.printf("Integer Rectangle Area: %d\n", integerRectangle.getWidth() * integerRectangle.getHeight());
        System.out.printf("Double Rectangle Area: %f\n", doubleRectangle.getWidth() * doubleRectangle.getHeight());
        System.out.printf("Object Rectangle Area: %d\n", (int) objectRectangle.getWidth() * (int) objectRectangle.getHeight());
        System.out.printf("Generic Rectangle Area: %d\n", genericRectangle.getWidth() * genericRectangle.getHeight());

        System.out.println(genericRectangle.isSquare());
    }
}
