package replit.loops;

import java.util.Scanner;

public class Factorial {

    /*
In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Example:

input: 5
output: 120

5 * 4 * 3 * 2 * 1
     */

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

     long factorial = 1;
     for(int num = input.nextInt();num > 0; num-- ){

      factorial *= num ;

     }
        System.out.println(factorial);
    }
}
