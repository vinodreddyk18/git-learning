package com.bell.b11.day5;

public class SimpleInheritance {
    public static void main(String[] args) {

    }
}

class A{
    int a;
    void bMtd(){
        System.out.println("inside A");
    }
}

class B extends A{
    int b;
    void bMtd() {
        System.out.println("inside B");
    }
}