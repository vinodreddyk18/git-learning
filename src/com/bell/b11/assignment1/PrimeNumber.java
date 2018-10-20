package com.bell.b11.assignment1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean prime = true;
        System.out.println("Please Enter a Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 2; i < (num - 1); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
            if (prime)
                System.out.println(num + " is a prime Number");
            else
                System.out.println(num + " is not a prime number");
    }
}
