package com.bell.b11.day7;

public class DemoAddress{

    public static void main(String[] args){

        Address A1 = new Address();
        A1.setName("Vinod");
        A1.setCity("Ashburn");
        A1.setZipcode(20148);

        Address A2 = new Address();
        A2.setName("Kumar");
        A2.setCity("Sterling");
        A2.setZipcode(20146);

        Address A3 = new Address("Raj", "Fairfax", 20198);


        System.out.println(A1.getName());
        System.out.println(A1.getCity());
        System.out.println(A1.getZipcode());
        System.out.println(A2.getName());
        System.out.println(A2.getCity());
        System.out.println(A2.getZipcode());
        System.out.println(A3.getName());
        System.out.println(A3.getCity());
        System.out.println(A3.getZipcode());


    }
}
