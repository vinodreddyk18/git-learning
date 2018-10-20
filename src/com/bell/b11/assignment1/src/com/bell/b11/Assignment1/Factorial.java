package com.bell.b11.assignment1.src.com.bell.b11.Assignment1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please Enter a Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("com.bell.b11.assignment1.Factorial is " + fact);
    }
}