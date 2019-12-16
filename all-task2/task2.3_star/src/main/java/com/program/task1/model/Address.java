package com.program.task1.model;

public class Address {

    private String street;
    private int numberHome;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(int numberHome) {
        this.numberHome = numberHome;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numberHome=" + numberHome +
                '}';
    }
}
