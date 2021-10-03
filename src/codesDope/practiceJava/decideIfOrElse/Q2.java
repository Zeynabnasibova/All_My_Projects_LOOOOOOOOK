package codesDope.practiceJava.decideIfOrElse;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        /*
        Take two int values from user and print greatest among them.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");

        int num1 = input.nextInt();

        System.out.println("Enter your second number");

        int num2 = input.nextInt();

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        if(num1 > num2){

            max = num1;

            System.out.println("Your max number is: " + max);

        }else{

            max = num2;

            System.out.println("Your max number is: " + max);

        }


    }

}
