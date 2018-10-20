package com.bell.b11.assignment4;

public class Program11 {

    public static void main(String[] args) {

        String s = "This is a Java class";
        String[] word = s.split(" ");
        int a = 0;
        for(int i = 0; i<word.length; i++){
            String revWord = word[i];
            System.out.println(word[i] +" " + s.indexOf(revWord,a)+" ");
            a += revWord.length();
        }
        System.out.println();

    }
}
