package com.bell.b11.day15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountryonTreesetDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Count please");

        int count = scan.nextInt();

        Set<Country> countries = new TreeSet<>();
        Country country = null;

        for (int i=0; i<count; i++){
            System.out.println("Provide Country name");
            String name = scan.next();

            System.out.println("Provide population");
            int pop = scan.nextInt();

            System.out.println("Provide GDP");
            double GDP = scan.nextDouble();

            country = new Country(name, pop, GDP);
            countries.add(country);
        }


        for (Country c : countries) {

            System.out.println(c);

        }
    }
}
