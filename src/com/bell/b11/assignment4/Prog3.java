package com.bell.b11.assignment4;

import static com.bell.b11.assignment4.Prog1.wordcount;

public class Prog3 {

    public static void main(String[] args) {
        String s = "This is A Java a class";
        String[] word = s.split(" ");
        int n=0;
        for(int i=0;i<wordcount(s);i++){
            if(word[i].length() == 1){
                n++;
            }
        }
        System.out.println("Number of single character words in the String are : "+ n);

    }
}
