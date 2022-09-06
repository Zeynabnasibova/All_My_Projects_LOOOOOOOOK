package codingPractice.w3resourceTask.basicPart1.mart1.basicPart1;
import java.util.Scanner;
public class N3 {
    /*
    3.
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
 */
     public static void main(String [] args){
         Scanner input = new Scanner (System.in);
         System.out.println("Enter your first number");
         int num1 = input.nextInt();
         System.out.println("Enter your second number");
         int num2 = input.nextInt();
         System.out.println("Enter your third number");
         int num3 = input.nextInt();

         int  average = (num1 + num2 + num3 )/3;
         System.out.println("Average of three number is " + average);
     }
}
