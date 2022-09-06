package codingPractice.replit_.statements2;

import java.util.Scanner;

public class TernaryOperator2 {

/*
    Write an expression using the conditional operator (? :) that compares the values of the variables num1 and num2. The result (that is the value) of this expression should be the value of the larger of the two variables. The larger value should be printed out.
     */

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number1:");
            int num1 = scan.nextInt();
            System.out.println("Enter number2:");
            int num2 = scan.nextInt();

            int result = (num1 >= num2) ? num1 : num2;
            System.out.println(result);



        }
    }