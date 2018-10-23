package com.bell.b11.day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class exampleProg {

    public static void main(String[] args) {
        ArrayList<Double> fees = new ArrayList<>();
        fees.add(1000.00);
        fees.add(1500.00);
        fees.add(2000.00);

        for (Double d:fees) {
            System.out.println(d);
        }


        System.out.println("****************************************************************************");
        HashSet<Integer> ids = new HashSet<>();
        ids.add(26);
        ids.add(2);
        ids.add(29);
        ids.add(4);
        ids.add(5);

        for (Integer s : ids) {
            System.out.println(s);
        }
        System.out.println("****************************************************************************");
        TreeSet<String> list = new TreeSet<>();
        list.add("shiva");
        list.add("Vamshi");
        list.add("vishnu");
        list.add("vinod");
        list.add("malli");

        for (String t : list) {
            System.out.println(t);
        }


    }
}