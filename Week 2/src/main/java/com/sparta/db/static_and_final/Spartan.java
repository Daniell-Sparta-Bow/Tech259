package com.sparta.db.static_and_final;

public class Spartan {

    public static String name;


    public static String getName() {
        return name;
    }

    public static void setName(String name){
        Spartan.name = name;
    }

    public static void printSpartan (Spartan spartan){
        System.out.println("Name " + getName());
    }

    public static void main(String[] args) {
        Spartan manish = new Spartan();
        Spartan gary = new Spartan();

        manish.setName("Manish");
        gary.setName("Gary");

        System.out.println(manish.getName());
        System.out.println(gary.getName());
        Spartan.printSpartan(manish);
    }

}
