package com.bell.b11.day4;

public class VariablesDemo {
    //instance variable
    int a;
    Student s1;

    public static void main(String[] args){
        VariablesDemo vd1 = new VariablesDemo();
    }

    public void test(){
        /*
        local variable / method variable
        local variable must be initialized else it will give you a compilation error
        */
        int c = 10;
        Student s2 = new Student();
        System.out.println(a);
        System.out.println(s1);
    }
}

class Student{
    int id;
    String name;
}