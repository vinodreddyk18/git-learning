package com.bell.b11.assignment4;
public class Prog4 {
    public static void main(String[] args) {

        String s = "This is a Java class";
        reverseEachWord(s);
    }

    static void reverseEachWord(String s) {
        String[] word = s.split(" ");
        String revS = "";

        for (int i = 0; i < word.length; i++) {
            String revWord = word[i];
            String revLetter = "";
            for (int j = revWord.length() - 1; j > -1; j--) {
                revLetter = revLetter + revWord.charAt(j);
            }
            revS = revS + revLetter + " ";
        }
        System.out.println(s);
        System.out.println(revS);
    }
}



