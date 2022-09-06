package codingPractice.replit_.statements2;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {


        /*
Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.
Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25

Enter first number:
140
Enter second number:
34
Enter third number:
1

Medium value is: 34

         */

        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter first number:");
        num1 = input.nextInt();
        System.out.println("Enter second number:");
        num2 = input.nextInt();
        System.out.println("Enter third number:");
        num3 = input.nextInt();


        if(num3 > num1 && num3 < num2){
            System.out.println("Medium value is: " + num3);
        }else if(num1 > num2 && num1 < num3){
            System.out.println("Medium value is: " + num1);
        }else if(num2 > num3 && num2 < num1){
            System.out.println("Medium value is: " + num2);
        }else if(num2 > num1 && num2 < num3){
            System.out.println("Medium value is: " + num2);
        }else if(num3 < num1 && num3 > num2){
            System.out.println("Medium value is: " + num3);
        }else if(num1 > num3 && num1 < num2){
            System.out.println("Medium value is: " + num1);
        }

    }
}
