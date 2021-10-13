package codesDope.practiceJava.InputByUser;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

    public static void main(String[] args) {


        /*
        4.
Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = input.next();

        System.out.println("Enter your roll number");

        String rollNUm = input.next();

        System.out.println("Enter your Filed of interest");

        String interest = input.next();


        System.out.println("Hey, my name is " + name + " and my roll number is" + rollNUm + ". My field of interest are " + interest + ".");

    }
}
