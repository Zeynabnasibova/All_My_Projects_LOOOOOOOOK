package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex2 {
    /**
     2. Write a Java program to print the sum of two numbers. Go to the editor
     Test Data:
     74 + 36
     Expected Output :
     110
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ex2 obj = new Ex2();
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Sum of numbers " + num1 +  " and " +  num2 + " = " +  obj.sum(num1,num2));
    }
    public int sum(int num1, int num2){

        int sumNumNum2 = num1 + num2;

        return sumNumNum2;
    }
}
