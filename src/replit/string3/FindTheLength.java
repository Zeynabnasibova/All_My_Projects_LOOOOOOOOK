package replit.string3;

import java.util.Scanner;

public class FindTheLength {

    public static void main(String[] args) {

        /*
        Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"

input: java

Display message: "Length is: 4"
         */

        System.out.println("Please enter the text:");

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int lengthSen = sentence.length();

        System.out.println("Length is: " + lengthSen);


    }
}
