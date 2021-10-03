package codesDope.practiceJava.decideIfOrElse;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {

        /*
        Take values of length and breadth of a rectangle from user and check if it is square or not.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length value of rectangle");

        int length = input.nextInt();

        System.out.println("Enter breadth of a rectangle");

        int breadth = input.nextInt();

        // rectangle 2*a + 2*b

        if(length == breadth){

            System.out.println("Square");

        } else {

            System.out.println("Rectangle");

        }
    }
}
