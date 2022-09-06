package codingPractice.replit_.loops;
import java.util.Scanner;
public class PrintNTimes {

    public static void main(String[] args) {

        /*
Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1

output: *

Example:

input: 3

output: ***
         */

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i = 0; i < num; i++){

            System.out.print("*");


        }
    }
}
