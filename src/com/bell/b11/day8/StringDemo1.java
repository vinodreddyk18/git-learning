package com.bell.b11.day8;
public class StringDemo1 {

    public static void main(String[] args){
        String name = "Suresh";
        System.out.println(name.length());

        System.out.println(name.concat(" Babu"));
        System.out.println(name.hashCode());

        System.out.println(name.toString());

        name = name+" Babu";

        System.out.println(name.hashCode());

        System.out.println(name);

        String name2 = "Suresh";
        String name3 = new String("Suresh");
        String name4 = new String("Suresh");
        String name5 = "Kumar";

        if(name == name2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");



    }
}
