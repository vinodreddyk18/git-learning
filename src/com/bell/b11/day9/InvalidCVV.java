package com.bell.b11.day9;

public class InvalidCVV extends java.lang.Exception{

    InvalidCVV(){
    }


    @Override
    public String toString() {

        return "CVV is Invalid, please enter a valid number";
    }
}

