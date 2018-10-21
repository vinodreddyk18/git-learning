package com.bell.b11.day12;

import java.util.ArrayList;

public class CollectionIntroductionDemo {

    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");
        color.add("White");
        color.add("Blue");

       for(String s:color){
           System.out.println(s);
       }
    }
}
