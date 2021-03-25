package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Primitive
        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 32767;
        int wholeNumbers = 122;
        long largeDecimalNumbers = -12;
        float numberWithDecimalPlaces = 8.3f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1243;
        boolean isTrueorFalse = true;
        char singleCharacter = '\u0041';

        double doubleNumber;
        int i = 23;
        doubleNumber = i;

        if(isTrueorFalse){
            System.out.println(veryLargeNumberWithDecimalPlaces);
        }

//        Switch Statement inside a do while loop
            Scanner myObj = new Scanner(System.in);
            char userChoice;
        do {

            System.out.println("Enter number to determine what day it is:");

            int day = myObj.nextInt();

            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("You entered number not in choice");
                    break;
            }

            System.out.println("Do you want to repeat? Y or N");


        }  while(userChoice = )


        System.out.println(doubleNumber);
        System.out.println(largeDecimalNumbers);

//    Non-Premitive Data Type

//    FizzBuzz Program





    }
}
