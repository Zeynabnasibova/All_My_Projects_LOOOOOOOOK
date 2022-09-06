package codingPractice.replit_.loops;
import java.util.Scanner;
public class PrintTriangle {

    public static void main(String[] args) {

        /*
        Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****

Example:

input: 3

output:
*
**
***
         */

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        String asterisks = "";

        for(int i = 0; i < num; i++ ){

          asterisks += "*";

            System.out.println(asterisks);

        }


    }
}
