package com.sparta.db.equals_and_hashcode;

import java.util.Objects;

public class Spartan {
    private String firstName;
    private String lastName;

    public Spartan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public boolean equals(Object obj) {// Honour the method signature
        if (this == obj) { // Compare to self
            return true;
        }

        if (obj == null) { // Compare to null
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Spartan otherSpartan = (Spartan) obj; // Object is now imprinted with the Spartan class;
        return Objects.equals(this.firstName, otherSpartan.firstName) && // Compare based on first and last name
                Objects.equals(this.lastName, otherSpartan.lastName);


    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void main(String[] args) {
        Spartan manish = new Spartan("Manish", "Gadhvi");
        Spartan alex = new Spartan("Manish", "Gadhvi");

        System.out.println(manish.hashCode());
        System.out.println(alex.hashCode());
        System.out.println(manish.equals(alex));
    }
}
