package javaTutorial.codesDope.practiceJava.InputByUser;
import java.util.Scanner;
public class Q6 {

    public static void main(String[] args) {

        /*
        Write a program to find square of a number.
E.g.-
INPUT : 2        OUTPUT : 4
INPUT : 5        OUTPUT : 25
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

        int num =input.nextInt();

        int squareNum = num * num;

        System.out.println("Square of " + num + " is: " + squareNum);


    }
}
