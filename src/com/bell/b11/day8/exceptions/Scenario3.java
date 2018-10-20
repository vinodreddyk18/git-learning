package com.bell.b11.day8.exceptions;

public class Scenario3 {

    public static void main(String[] args) throws Exception{
        Scenario3 s1 = new Scenario3();
        int x=0;
        x = s1.division(10, 0);

    }

    int division(int a, int b) throws Exception{
        int c = a/b;
        return c;

    }
}
