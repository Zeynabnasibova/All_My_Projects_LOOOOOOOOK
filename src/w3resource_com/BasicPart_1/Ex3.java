package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex3 {

    /*
    3. Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16
     */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your  second number");
        int num2 = input.nextInt();

        Ex3 obj = new Ex3();
        System.out.println("Divide num1 to num2 = " + obj.divide(num1, num2));
    }


    public double divide(int num1, int num2){

        double div = num1 / num2;

        return div;

    }
}
