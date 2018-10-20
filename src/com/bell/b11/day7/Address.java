package com.bell.b11.day7;

public class Address {

    private String name;
    private String city;
    private int zipcode;

    Address(){
        System.out.println("Default constructor");
    }

    Address(String name, String city, int zipcode){

        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
