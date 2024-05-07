package com.sparta.pcw.codesmellsrefactoring;

public class Address {
    int houseNo = 0;
    String street = "";
    String town = "";

    public Address(int houseNo, String street, String town) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    @Override
    public String toString() {
        return getHouseNo() + " " + getStreet() + ", " + getTown();
    }

}