package com.bell.b11.day8;

public class ObjectDemo {

    int a = 10;
    String name = "vinod";
    public static void main(String[] args){
        ObjectDemo od = new ObjectDemo();
        System.out.println(od.toString());
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
