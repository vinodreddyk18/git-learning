package com.bell.b11.assignment4;

public class Program5 {

    public static void main(String[] args) {
        String s = "This is a Java Class";
        String[] word = s.split(" ");

        for (int i = word.length - 1; i > -1; i--) {
            String revWord = word[i];
            String[] revLetter = revWord.split(" ");
            for (int j = revLetter.length-1; j>-1; j--) {

                System.out.println(revLetter[j]);

            }
        }
    }
}
