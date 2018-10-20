package com.bell.b11.day8.exceptions;
import java.util.Scanner;
public class Scenario2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        int x[] = {10,20,30};
        try {
             c = a / b;
            System.out.println("Division "+c);
            //System.out.println(x[2]);
        }catch( ArithmeticException e){
            System.out.println("your division is having a problem, fix it");
        }try {
            System.out.println(x[2]);
            System.out.println("i execute only when there is no exception above me");
        }
            //catch (IndexOutOfBoundsException e){
            //System.out.println("Your Array having an issue, fix it");
        //}
        finally {
            System.out.println();
        }
        int d = a*b;



        System.out.println("Multiply " +d);
    }
}
