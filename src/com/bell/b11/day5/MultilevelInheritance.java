package com.bell.b11.day5;

public class MultilevelInheritance {

    public static void main(String[] args) {

    }
}

class A1{
    int a;
    void bMtd(){
        System.out.println("inside A");
    }
}

class B1 extends A1{
    int b;
    void bMtd() {
        System.out.println("inside B");
    }
}
