package com.bell.b11.assignment1.src.com.bell.b11.Assignment1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        int a;
        int b=0;
        int temp;
        System.out.println("Please Enter Your Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        temp = num;
        while (num != 0) {
            a = num % 10;
            num = num / 10;
            b = b + (a * a * a);
        }
        if (b == temp)
            System.out.println("The Number is a com.bell.b11.assignment1.Armstrong Number");

        else
            System.out.println("The Number is not a com.bell.b11.assignment1.Armstrong Number");
    }
}

