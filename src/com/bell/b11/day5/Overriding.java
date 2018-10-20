package com.bell.b11.day5;

/*SAME METHOD SIGNATURE


 */

public class Overriding {

    public static void main(String[] arg){
        Manager m1 = new Manager();
        System.out.println(m1.salary());

        Clerk c1 = new Clerk();
        System.out.println(c1.salary());

    }
}

class Employee{
    int base = 2000;

    int salary(){
        return base;
    }
}

class Manager extends Employee{

    int salary(){
        return base+30000;
    }

}

class Clerk extends Employee{

    int salary(){
        return base+1000;
}

}