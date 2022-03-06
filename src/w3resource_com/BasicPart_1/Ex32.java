package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex32 {
    /*
    32. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int max = Integer.MIN_VALUE;

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }
    }
}
