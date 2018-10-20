package com.bell.b11.day5;

public class AcessModifiersDemo {

    Car cobj1 = new Car( "tesla", 30000);

    public static void main(){
       // cobj1.
    }
}

class Car{

    private String model;
    protected int cost;
    int year;
    public static String make;

    Car(){
        System.out.println("Im inside default const");
    }

    Car(String model, int cost){
        System.out.println("Im inside arg const");
        this.model = model;
        this.cost = cost;
    }

    void display(){
        int value = 20;
        System.out.println("Im display method");
        System.out.println(model);
    }
}
