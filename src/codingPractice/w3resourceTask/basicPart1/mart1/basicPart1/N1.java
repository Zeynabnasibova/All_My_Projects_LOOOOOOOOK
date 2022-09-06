package codingPractice.w3resourceTask.basicPart1.mart1.basicPart1;
import java.util.Scanner;
public class N1 {
    /*
5. Write a Java program that takes two numbers as input and displays the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int average = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + average);
    }

}
