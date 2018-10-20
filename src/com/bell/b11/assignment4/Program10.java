package com.bell.b11.assignment4;

import java.sql.SQLOutput;

public class Program10{

    public static void main(String[] args) {
        String s = "This is a Java Class";

        System.out.println("Letters which are not repeated");

        notRepLet(s);
    }

    static void notRepLet(String s){
        String[] repLetter = (s.replaceAll(" ","")).split("");
        String[] temp = repLetter;
        for(int i=0;i<repLetter.length; i++){
            int count = 0;
            for(int j=0; j<temp.length; j++){
                if(repLetter[i].equals(temp[j])){
                    count++;
                }
            }
            if (count == 1)
                    System.out.println(repLetter[i]+ " repeats "+count);
        }

    }
}
