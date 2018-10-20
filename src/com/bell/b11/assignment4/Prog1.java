package com.bell.b11.assignment4;
public class Prog1 {

    public static void main(String[] args){
        String s = "This is a Java Class";

        System.out.println(s);
        System.out.println("This String has " + wordcount(s) + " words");

    }

    static int wordcount(String s){

        int count = 0;

        char ch[] = new char[s.length()];
        for(int i=0 ; i< s.length(); i++ ){
            ch[i] = s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }

        return count;
    }
}
