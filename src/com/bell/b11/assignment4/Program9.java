package com.bell.b11.assignment4;

public class Program9 {
    public static void main(String[] args){
        String s = "This is a Java class";

        repeatLet(s);

    }

    static void repeatLet(String s){

        String[] repLetter = (s.replaceAll(" ","")).split("");
        String[] temp = repLetter;
        for(int i=0;i<repLetter.length; i++){
            int count = 0;
            for(int j=0; j<temp.length; j++){
                if(repLetter[i].equals(temp[j])){
                    count++;
                }
            }
            System.out.println(repLetter[i]+ " repeats "+count);
        }


    }

}
