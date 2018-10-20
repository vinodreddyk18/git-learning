package com.bell.b11.assignment1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        int num;
        int reverseNum=0;
        System.out.println("Please Enter the Number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int temp = num;
        while (num != 0){
            reverseNum = reverseNum*10;
            reverseNum = reverseNum + num%10;
            num = num/10;
        }
        System.out.println("The Reversed Number is  "+reverseNum);

        if (reverseNum == temp)
            System.out.println("Given Number is a Palindrome" );
        else
            System.out.println("Given Number is not a Palindrome");

    }
}