package inerviewJavaTaskLeyla;
import java.util.Scanner;
public class Swap2Number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();//2
        System.out.println("Enter your second number");
        int num2 = input.nextInt();//3

        num1 = num1 + num2; //2 + 3 = 5

        num2 = num1 - num2;//5 - 3 = 2

        num1 = num1 - num2; // 5 - 2 = 3

        System.out.println("Num1 = " + num1 );
        System.out.println("Num2 = " + num2);

    }
}
