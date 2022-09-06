package codingPractice.replit_.loops;
import java.util.Scanner;
public class PritLetter {

    public static void main(String[] args) {

        /*
        Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

Example:

input:
a
f

output: abcdef

Example:

input:
a
d

output: abcd

Example:

input:
B
O

output: BCDEFGHIJKLMNO
         */


        Scanner input = new Scanner(System.in);

        char starLetter = input.next().charAt(0);
        char endLetter = input.next().charAt(0);


        for(char ch = starLetter; ch <= endLetter;ch++){

            System.out.println(ch);

        }


    }
}
