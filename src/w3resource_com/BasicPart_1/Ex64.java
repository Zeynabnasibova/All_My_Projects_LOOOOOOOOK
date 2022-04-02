package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex64 {
    /*
    64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Sample Output:
Input the first number : 35
Input the second number: 45
Result: true
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        System.out.println(commonDigi(num1,num2));

    }
    public static boolean commonDigi(int num1, int num2){
        if(num1 < 25 || num2 > 75){
            return false;
        }else if(num1 >= 25 && num2 <= 75 && num1 % 10 == num2 % 10 || num1 / 10 == num2 / 10){
            return true;
        }else{
            return  false;
        }
    }
}