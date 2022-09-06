package javaTutorial.codesDope.practiceJava.decideIfOrElse;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {


        /*
        A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
         */



        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = input.nextInt();

        if(marks < 25){

            System.out.println("F");

        }else if(marks >= 25 && marks < 45){

            System.out.println("E");

        }else if(marks >= 45 && marks < 50){

            System.out.println("D");
        } else if(marks >= 50 && marks < 60 ) {

            System.out.println("C");
        }else if(marks >= 60 && marks < 80 ){

            System.out.println("B");
        }else if(marks >= 80){

            System.out.println("A");
        }



    }
}
