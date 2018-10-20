package com.bell.b11.day9;

import java.util.Random;
import java.util.Scanner;

public class CreditCardProcessingDemo {

    public static void main(String[] args) {

        System.out.println("Please enter the credit card number");

        Scanner scan = new Scanner(System.in);
        String cardNumber = scan.next();

        System.out.println("Please enter the CVV number");

        Scanner scan2 = new Scanner(System.in);
        String cvvNumber = scan2.next();

        CreditCardProcessingDemo ccpd = new CreditCardProcessingDemo();

        try {
            ccpd.processItem(cardNumber);
        } catch (InvalidCreditCardNumbr invalidCreditCardNumbr) {
            invalidCreditCardNumbr.printStackTrace();
        }

        try {
            ccpd.processItem1(cvvNumber);
        } catch (InvalidCVV invalidCVV) {
            invalidCVV.printStackTrace();
        }

    }

    private void processItem(String cardNumber) throws InvalidCreditCardNumbr {
        if(cardNumber.length() == 16){


            System.out.println("Thank you!! You're order has been processed, refnumber " +new Random().nextInt());
        }else{
            throw new InvalidCreditCardNumbr ();
        }

    }

    private void processItem1(String cvvNumber) throws InvalidCVV{
        if(cvvNumber.length()==3){
            System.out.println();
        }else
        {
            throw new InvalidCVV();
        }

    }
}
