package com.bell.b11.day9;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.*;

public class InvalidCreditCardNumbr extends java.lang.Exception {

    String number;
    Date date=new Date();

    InvalidCreditCardNumbr(){

    }

    InvalidCreditCardNumbr(String number){
        this.number = number;

    }

    @Override
    public String toString() {

        if(number != null){

            LocalDateTime ldt = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM");
            System.out.println(ldt.format(dtf));
            return "Hey, looks like the credit card number "+ number+" is "+number.length()+"please provide 16 digit number";
        }
        return "Hey, Sorry... the number you provided is invalid. Please try again";
    }
}
