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
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your num1");
        int num1 = input.nextInt();
        int num2= input.nextInt();
        int num3 = input.nextInt();
        boolean abc = input.nextBoolean();
        System.out.println(num(num1,num2,num3,abc));
    }
    public static boolean num(int num1, int num2, int num3, boolean abc){

        if(num2 > num1 && num3 > num2 || abc == true && num3 > num2){
            return  true;
        }else{
            return false;
        }
    }
}