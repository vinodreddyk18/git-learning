package com.bell.b11.assignment1;

import java.util.Scanner;

public class MinNumber {

    public static void main (String[] args) {
        int num;
        int smallest;
        System.out.println("Enter Four Numbers");
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        smallest = num;
        for (int i = 1; i < 4; i++) {
            num = input.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest no is " + smallest);

    }



}
