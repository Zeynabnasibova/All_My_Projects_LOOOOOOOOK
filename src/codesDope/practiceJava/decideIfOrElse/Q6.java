package codesDope.practiceJava.decideIfOrElse;
import java.util.Scanner;
public class Q6 {

    public static void main(String[] args) {

        /*
        Take input of age of 3 people by user and determine oldest and youngest among them.
         */


        Scanner input = new Scanner (System.in);
        System.out.println("Enter age1");
        int age1 = input.nextInt();
        System.out.println("Enter age2");
        int age2 = input.nextInt();
        System.out.println("Enter age3");

        int age3 = input.nextInt();

        if(age1 > age2 && age1 > age3 && age2 > age3){

            System.out.println("age1 oldest and age3 youngest");

        }else if (age2 > age1 && age2 > age3 && age3 > age1 ){

            System.out.println("age2 oldst and age1 youngest");

        }else if(age3 > age1 && age3 > age2 && age1 > age2) {

            System.out.println("aga3 oldest and age 2 youngest");

        }else if(age3 > age1 && age3 > age2 && age2 > age1){

            System.out.println("age3 oldest and age1 youngest");
        }

    }
}
