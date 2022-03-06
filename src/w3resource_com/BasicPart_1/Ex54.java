package w3resource_com.BasicPart_1;

import java.util.Scanner;

public class Ex54 {
    /*
    54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        System.out.println("Enter your third number");
        int num3 = input.nextInt();
        System.out.println(rigthDigit(num1,num2,num3));
    }
    public static boolean rigthDigit(int num1, int num2, int num3){
        if(num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10){
            return true;
        }else{
            return false;
        }
    }
}
