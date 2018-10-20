package com.bell.b11.assignment1;

import java.util.Scanner;

public class Perfecto {
    public static void main(String[] args) {
        System.out.println("Please Enter a Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int Temp = 1;
        for (int i = 1; i < num; i++) {
            Temp = Temp + i;
        }

    }
}
