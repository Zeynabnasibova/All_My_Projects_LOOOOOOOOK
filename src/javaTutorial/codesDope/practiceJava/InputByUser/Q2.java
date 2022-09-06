package javaTutorial.codesDope.practiceJava.InputByUser;

import java.util.Scanner;

public class Q2 {


    public static void main(String[] args) {

        /*
Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results.
         */



        Scanner input = new Scanner (System.in);


        System.out.println("Enter your firts number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println(sum);
        System.out.println(product);

    }
}
