package replit.statements2;

import java.util.Scanner;

public class GreaterNumber {
      /*
    Use an if statement to determine if a or b is bigger. Then print:

$number is greater

Examples:

a=1
b=2

output:
2 is greater

a=5
b=7

output:
7 is greater
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }


    }
}
