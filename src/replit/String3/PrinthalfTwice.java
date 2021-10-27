package replit.String3;

import java.util.Scanner;

public class PrinthalfTwice {

    public static void main(String[] args) {

        /*
        Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja

input: unity

output: unun

         */

        Scanner input = new Scanner(System.in);
        String word = input.next();
        String twice = word.substring(0,word.length()/2);
        System.out.println(twice.concat(twice));

    }
}
