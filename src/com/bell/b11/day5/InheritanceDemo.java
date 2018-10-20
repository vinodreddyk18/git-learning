package com.bell.b11.day5;

public class InheritanceDemo {

    public static void main(String[] args){

        Bike b1 = new Bike( 25);

    }
}

class Bike{

    int speed;
    Bike(int speed){
        this.speed = speed;
    }
    void increaseSpeed(){
        speed = speed+1;
        System.out.println(speed);
    }
    void decreseSpeed() {
        speed = speed - 1;
        System.out.println(speed);
    }

}

/*class MountBike extends Bike{
    int brake;
   // MountBike(){
        System.out.println("dummy mountBike Constructor");
    }

    MountBike(int brake){
        System.out.println("MountBike ARG Constructor");
        this.brake = brake;
    }

}*/