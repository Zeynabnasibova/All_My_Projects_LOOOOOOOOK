package codesDope.practiceJava.decideIfOrElse;
import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {

        /*
        A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
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
