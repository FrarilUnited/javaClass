package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

        //1.a.i Widening Casting

        System.out.println("Widening Casting");
        System.out.println();
        int myNum = 8;
        double myNumToDouble = myNum;
        System.out.println("from int =  "+ myNum);
        System.out.println("to double = " + myNumToDouble);
        System.out.println("Cast automatically");
        System.out.println();

        //1.a.ii Narrowing Casting

        System.out.println("Narrowing Casting");
        System.out.println();
        double myDouble = 8.8;
        int myDoubleToInt = (int)myDouble;
        System.out.println("from double =  "+ myDouble);
        System.out.println("to int = " + myDoubleToInt);
        System.out.println("Cast Manually");
        System.out.println();

        //2. Run and display following operators in your java clas program
        //2. Arithmetic Operators

        System.out.println("Arithmetic Operators");
        System.out.println();
        System.out.println("Addition 8 + 8 = " + (8 + 8));
        System.out.println("Subtraction 8 - 8 = " + (9 - 8));
        System.out.println("Multiplication 8 * 8 = " + (8 * 8));
        System.out.println("Division 8 / 8 = " +  (8 / 8));
        System.out.println("Modulo 9 % 8 = " + (9 % 8));
        System.out.println();

        //2. Assignment Operator

        System.out.println("Assignment Operator");
        System.out.println();
        int equal = 9;
        int addEqual = equal +=2;
        int subEqual = equal -=2;
        int mulEqual = equal *= 2;
        int divEqual = equal /=2;
        int modEqual = equal % 2;
        System.out.println("equal value is 9");
        System.out.println("equal +=2 is " + addEqual);
        System.out.println("equal -=2 is " + subEqual);
        System.out.println("equal *=2 is " + mulEqual);
        System.out.println("equal /=2 is " + divEqual);
        System.out.println("equal % 2 is " + modEqual);
        System.out.println();

        //2.Comparison Operator

        System.out.println("Comparison Operator");
        System.out.println();
        int firstNum = 7;
        int secondNum = 8;
        System.out.println("First Number = 7 & Second Number = 8");
        if(firstNum>secondNum){
            System.out.println("1st number is lesser than 2nd number? It's False");
        }else if(firstNum>=secondNum){
            System.out.println("1st number is lesser than or equal to 2nd number? Not True");
        }else if(firstNum<secondNum){
            System.out.println("1st number is  greater than 2nd number? It's True");
        }else if(firstNum<=secondNum){
            System.out.println("1st number is greater than or equal to 2nd number?True");
        }else if(firstNum==secondNum){
            System.out.println("First Number and Second Number are not equal");
        }else{
            System.out.println("N/A");
        }
        System.out.println();

        //2. Logical Operators

        System.out.println("Logical Operator");
        System.out.println();
        int thirdNum = 88;
        int fourthNum = 77;
        boolean isTrue = true;

        if ((thirdNum>fourthNum) && (isTrue)) {
            System.out.println("Yes both are true using AND Logical Operator");
        }

        if((thirdNum<fourthNum) || (isTrue)){
            System.out.println("Only one is True using OR Logical Operator");
        }
        System.out.println();

        //2. Bitwise Operator

        System.out.println("Bitwise Operator");
        System.out.println();
        int bitwiseAnd = 7 & 8; //7(0111) & 8(1000) = 0000
        int bitwiseOr = 8 | 7; //8(1000) | 7(0111) = (15)1111
        int bitwiseXor = 7 ^ 8; //7(0111) ^ 8(1000) = (15)1111
        int bitwiseNot = ~8; //
        int bitwiseZeroFillLeftShift = 7 << 8;
        int bitwiseSignedRightShift = 8 >> 7;
        int bitwiseZeroFillRightShift = 7 >>> 8;

        System.out.println(" 7 & 8 = "+ bitwiseAnd);
        System.out.println(" 8 | 7 = "+ bitwiseOr);
        System.out.println(" 7 & 8 = "+ bitwiseXor);
        System.out.println(" ~8 = "+ bitwiseNot);
        System.out.println(" 7 << 8 = "+ bitwiseZeroFillLeftShift);
        System.out.println(" 8 >> 7 = "+ bitwiseSignedRightShift);
        System.out.println(" 7 >>> 8 = "+ bitwiseZeroFillRightShift);
        System.out.println();

        //3. if-Else Conditional Statement
        //Write a method that input weekday number to calculate the weekday name:
        System.out.println("If-else Conditional Statement");
        System.out.println();
        weekdayNumber();
        System.out.println();

        //4.Switch Conditional Statement

        System.out.println("Switch Conditional Statement");
        System.out.println();
        switchCoditionalStatement();
        System.out.println();

        //5. While Loops
        //5.a. Write a method that loop and display an assigned variable from 1 up to 10:

        System.out.println("While Loops");
        System.out.println();
        whileLoop();
        System.out.println();

        //5.b. Write a method with a while loop to prints 1 through N square brackets. For example, if n = 6 print.

        whileLoopsWithSquareBrackets();
        System.out.println();

        //5.c. Write a method with a while loop that computes the sum of first n positive integers:
            System.out.println("Please enter a number and will find its summation:");
            int desiredNum = keyboard.nextInt();
            computeSum(desiredNum);


        //6. Do While Loops
        // Write a method with a do-while loop that generates an array of the first n even numbers.

            doWhileLoops();
        // 7. For Loops
        // Write a method with a for-loop that generates the first n numbers in the Fibonacci sequence.

        System.out.println("Please enter a number to execute a Fibonacci Sequence:");
        int numFibonacci = keyboard.nextInt();
        forLoopFibonacci(numFibonacci);

        /* 8.Group Exercises: Loop
         Create a dynamic sentence with the following instructions.
         1. Create a method that generates names of your boy friends randomly.
         2. Create a method that generates names of your girl friends randomly.
         3. Create a method that generates types of relationships randomly.
         4. Display a sentence using the methods from a,b,c. */
            String gen1 = boyFGen();
            String gen2 = girlFGen();
            String gen3 = relFGen();

            System.out.println(gen1 + " " + gen3 + " " + gen2);

    }

public static void weekdayNumber() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please Enter number from 1 to 7:");

    int num = s.nextInt();
    if (num == 1) {
        System.out.println("1 = Monday");
    } else if (num == 2) {
        System.out.println("2 = Tuesday");
    } else if (num == 3) {
        System.out.println("3 = Wednesday");
    } else if (num == 4) {
        System.out.println("4 = Thursday");
    } else if (num == 5) {
        System.out.println("5 = Friday");
    } else if (num == 6) {
        System.out.println("6 = Saturday");
    } else if (num == 7) {
        System.out.println("7 = Sunday");
    } else{
        System.out.println("You Entered an invalid number.");
    }

}

public static void switchCoditionalStatement(){
    Scanner s = new Scanner(System.in);
    System.out.println("Please Enter number from 1 to 7:");

    int num = s.nextInt();

    switch (num){
        case 1:
            System.out.println("1 = Monday");
            break;
        case 2:
            System.out.println("2 = Tuesday");
            break;
        case 3:
            System.out.println("3 = Wednesday");
            break;
        case 4:
            System.out.println("4 = Thursday");
            break;
        case 5:
            System.out.println("5 = Friday");
            break;
        case 6:
            System.out.println("6 = Saturday");
            break;
        case 7:
            System.out.println("7 = Sunday");
            break;
        default:
            System.out.println("You entered an invalid number");
    }
}

public static void whileLoop(){
        int i = 1;

        while(i <= 10){
            System.out.println(i);
            i++;
        }
}

public static void whileLoopsWithSquareBrackets(){
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a your desired number:");
    int desiredNum = s.nextInt();
    int i = 1;

    while(i<=desiredNum){
        System.out.println("[" + i + "]");
        i++;
    }

}

public static void computeSum(int desiredNum){

    int i = 1, summation = 0;

    while(i<=desiredNum){
        summation += i;
        i++;
    }

    System.out.println("The summation of "+ desiredNum + " is " + summation);

}

public  static void doWhileLoops(){

        int [] arrayOfNumbers = {88, 2, 5,-2, 4, 6, 8, 10, 11, 13, 19, 20};
        int i = 0;
        System.out.println("The even numbers of the array are:");
        do{

            if( arrayOfNumbers[i] % 2 == 0){
                System.out.println(arrayOfNumbers[i]);
            }
            i++;
        }while (i < arrayOfNumbers.length);
}

public static void forLoopFibonacci(int userNum){

        int n1 = 0, n2 = 1, i = 0;
        System.out.println("The Fibonacci Sequence of " + userNum + ":");
        for(i = 0; i < userNum; i++){
            System.out.println(n1);

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
    }

}

public static String boyFGen(){
        String [] boyNames = {"John", "Rhuds", "Kevin", "Lando", "Joe", "Kyrie", "Anthony",
                "James", "Niel", "RJ"};
        int randomNum = (int)(Math.random()*boyNames.length);
        String boyName = boyNames[randomNum];

        return boyName;
}

public static String girlFGen(){
    String [] girlNames = {"April", "Mae", "Roxanne", "Phoebe", "Zaire", "Jamaica", "Venezuela",
            " Maria louie", "Ellysa", "Jhoana"};
    int randomNum = (int)(Math.random()*girlNames.length);
    String girlName = girlNames[randomNum];

    return girlName;
}

public static String relFGen(){
    String [] relationships = {"loves", "wants to be friend with", "always spend time", "likes to work with",
            "hates", "always mad at", "always play with", "is happy to cook with", "can learn a lot from",
            "Teaches homework to"};
    int randomNum = (int)(Math.random()*relationships.length);
    String relationship = relationships[randomNum];

    return relationship;
}


}