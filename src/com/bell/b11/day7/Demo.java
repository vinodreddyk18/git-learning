package com.bell.b11.day7;

/*
*Initialize object through setters or through argument constructor
*
 */

public class Demo {

    public static void main(String[] args) {

        Hospital h1 = new Hospital();
        h1.setName("Childrens National");
        h1.setZipcode(20186);

        Hospital h2 = new Hospital();
        h1.setName("Pediatrics");
        h2.setZipcode(20152);

        Hospital h3 = new Hospital( "Orthopedic", 22102 );

        System.out.println(h1.getName());
        System.out.println(h1.getZipcode());
        System.out.println(h2.getName());
        System.out.println(h2.getZipcode());
        System.out.println(h3.getName());
        System.out.println(h3.getZipcode());
    }
}