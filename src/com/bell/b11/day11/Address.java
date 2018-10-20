package com.bell.b11.day11;

public class Address {

    int hNo;
    String street;
    int zipCode;

    public Address(int hNo, String street, int zipCode) {
        this.hNo = hNo;
        this.street = street;
        this.zipCode = zipCode;
    }

    public int gethNo() {
        return hNo;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipcode() {
        return zipCode;
    }

    public void setZipcode(int zipcode) {
        this.zipCode = zipcode;
    }
}
