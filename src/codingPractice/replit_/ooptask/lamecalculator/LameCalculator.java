package codingPractice.replit_.ooptask.lamecalculator;

import java.util.Scanner;

public class LameCalculator {


    public int plus(int a,int b){

        return a + b;

    }
    public int minus(int a, int b){

        return a-b;

    }

    public int multiply(int a, int b){

        return a * b;
    }

    public int divide(int a, int b){

        return a/b;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LameCalculator lc = new LameCalculator();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lc.plus(a, b));
        System.out.println(lc.minus(a, b));
        System.out.println(lc.multiply(a, b));
        System.out.println(lc.divide(a, b));

    }
}

/*
The LameCalculator class has instance methods that can do simple math operations on two numbers. Create the methods: plus, minus, multiply and divide.

All the methods get two ints then the method does the required math operation and returns the result as an int.

Example:

LameCalculator lc = new LameCalculator();

lc.plus(1,1)
returns:2

lc.minus(1,1)
returns:0

lc.multiply(2,1)
returns:2

lc.divide(10,2)
returns:5
 */