package com.bell.b11.day8.exceptions;
import java.util.Scanner;
import java.time.LocalDate;
public class AmazonCheckoutDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide Date in MM-YYYY format");
        String userDate = scan.next();

        String[] dateArray = userDate.split("-");
        String monthStr = dateArray[0];
        String yearStr = dateArray[1];

        int month = Integer.parseInt(monthStr);
        int year = Integer.parseInt(yearStr);

        LocalDate userDateFormat = LocalDate.of(year, month, 1);
        System.out.println(userDateFormat);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);


    }
}
