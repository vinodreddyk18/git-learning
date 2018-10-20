package com.bell.b11.day5;

/*
1.Abstract class is a class where you may have zero or more abstract methods
2.if you have abstract method, then you must make your class as abstract
3.If child class fail to provide implementation of abstract parent class then child class must become abstract
4.If you extend a parent abstract class then you must implement parent abstract methods or do point 3
5.You can create a reference variable but you cannot create an object for abstract class.
 */

public class AbstractDemo {
    public void main(String[] args){

    }
}

abstract class Animal{
    abstract void eat();

    void noOfeyes(){
        System.out.println("Number of eyes"+ 2);
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog");
    }
}