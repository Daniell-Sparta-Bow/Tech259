package com.sparta.pcw.codesmellsrefactoring;


public class Person
{
    private final String firstName; // firstName
    private final String lastName;
    private Address address;
    private int age;

    public Person(String firstName, String lastName) //firstName + // lastName
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Address address) {
        this(firstName, lastName);
        this.address = address;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }



    @Override
    public  String toString() {
        return String.format("%s Name: %s Age: %s. Address: %s",
                             super.toString(),
                             getFullName(),
                             age,
                             getAddressString());
    }

    private String getAddressString(){
        if (this.address == null){
            return "<no address set>";
        } else{
            return this.address.toString();
        }
    }



}