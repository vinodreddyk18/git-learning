package com.bell.b11.assignment1;

import java.util.Scanner;

public class FibinocciNum {

    public static void main(String[] args){
        int temp1=0, temp2=1, Number, result;
        System.out.println("Please Enter your number");

        Scanner input = new Scanner(System.in);
        Number = input.nextInt();

        for(int i=1; i<= Number; i++) {
            System.out.println(temp1+" ,");
            result = temp1 + temp2;
            temp1 = temp2;
            temp2 = result;
        }



    }
}
