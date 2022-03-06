package w3resource_com.BasicPart_1;

import java.util.Scanner;

public class Ex53 {
    /*
    53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.
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
        System.out.println(greater(num1, num2, num3));
    }
    public static boolean greater(int num1, int num2, int num3){

        if(num2 > num1 && num3 > num2 ){
            return true;
        }else{
            return false;
        }
    }
}
