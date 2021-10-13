package codesDope.practiceJava.decideIfOrElse;
import java.util.Scanner;
public class Q11 {

    public static void main(String[] args) {

        /*
        Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter");
        char leter = input.next().charAt(0);

        if(leter >= 'a' && leter <= 'z' ){

            System.out.println("lowercase");

        }else if(leter >= 'A' && leter <= 'Z'){

            System.out.println("uppercase");
        }else{

            System.out.println("not leter");
        }



    }
}
