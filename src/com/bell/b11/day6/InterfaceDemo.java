package com.bell.b11.day6;

public class InterfaceDemo {

    public static void main(String[] args){

        Vehicle v1 = new Jet();
        Vehicle v2 = new Boeing();
        v1.fuel();
        v1.mode();
        v1.speed();
    }

}

/*
*By default all the methods are public abstract
*All variables are final and static
*Interfaces doesn't allow constructors
*Any sub class of Interface should implement all the methods or make that subclass as abstract class
*

 */
interface Vehicle {

    int MIN_SEATS = 5;

    void speed();
    void mode();
    void fuel();
}

abstract class Plane implements Vehicle{

    @Override
    public void mode() {
        System.out.println("On Air");
    }

    @Override
    public void fuel(){
        System.out.println("White Petrol");
    }

}

class Jet extends Plane{

    @Override
    public void speed(){
        System.out.println("328 mph");
    }
}

class Boeing extends Plane{

    @Override
    public void speed(){
        System.out.println("600 mph");
    }
}


abstract class Car implements Vehicle {

    @Override
    public void mode(){
        System.out.println("On Road");
    }
}

class Tesla extends Car{
    @Override
    public void fuel(){
        System.out.println("Battery");
    }

    @Override
    public void speed(){
        System.out.println("60 mph");
    }
}

class Accord extends Car{
    @Override
    public void fuel(){
        System.out.println("Gas");
    }

    @Override
    public void speed(){
        System.out.println("50 mph");
    }
}

class Truck extends Car {


    @Override
    public void speed(){
        System.out.println("40 mph");
    }

    @Override
    public void fuel() {

    }
}

abstract class Ship implements Vehicle{
    @Override
    public void mode(){
        System.out.println("Water");
    }
}

class Cruise extends Ship{

    @Override
    public void fuel(){
        System.out.println("x");
    }

    public void speed(){
        System.out.println("15 mph");
    }

}

class Cargo extends Ship{

    @Override
    public void fuel(){
        System.out.println("Y");
    }

    @Override
    public void speed(){
        System.out.println("10 mph");
    }

}