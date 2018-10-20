package com.bell.b11.day7;

public class Hospital {

    private String name;
    private int zipcode;

    Hospital() {

        System.out.println("Default constructor");
    }

    Hospital(String name, int Zipcode) {
        this.name = name;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}

