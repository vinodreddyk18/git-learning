package com.bell.b11.day4;

public class StaticDemo {
    public static void main(String[] args){
        ABC obj1 = new ABC();
        //obj1.initialize( g: 10, h: 50);
        obj1.display();


    }
}

class ABC {
    int x;
    int y;

    void initialize(int g, int h){
        x =g;
        y = h;
    }

    void display(){
        System.out.println(x + " " + y);
    }
}
