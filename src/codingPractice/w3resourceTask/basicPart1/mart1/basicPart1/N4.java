package codingPractice.w3resourceTask.basicPart1.mart1.basicPart1;
import java.util.Scanner;
public class N4 {
    /*
    4.

15. Write a Java program to swap two variables.
 */

     public static void main(String [] args){
         Scanner input = new Scanner (System.in);
         int num1 = input.nextInt();//2
         int num2 = input.nextInt();//3

         num1 = num1 + num2; //2 + 3 = 5
         num2 = num1 - num2; // 5 - 3 = 2
         num1 = num1 - num2;// 5 - 2 = 3

         System.out.println("num1 = " + num1);
         System.out.println("num2 = " + num2);
     }
}
