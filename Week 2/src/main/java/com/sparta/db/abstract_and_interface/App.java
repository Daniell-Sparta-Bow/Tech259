package com.sparta.db.abstract_and_interface;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(10, 11);
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

    }
}
