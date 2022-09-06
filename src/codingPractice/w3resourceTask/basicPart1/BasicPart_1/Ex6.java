package codingPractice.w3resourceTask.basicPart1.BasicPart_1;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int multiple  = num1  * num2;
        int substract = num1 - num2;
        int div = num1 / num2;
        int reaminder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + multiple);
        System.out.println(num1 + " - " + num2 + " = " + substract);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + reaminder);
    }
}
