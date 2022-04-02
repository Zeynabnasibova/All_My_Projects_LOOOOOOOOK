package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex65 {
    /*
    65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:
Input the first number : 19
Input the second number: 7
5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();//5
        int num2 = input.nextInt();//2
        int divided = num1 / num2;//5 / 2 = 2
        int module = num1 - (divided * num2);// 5 - (2 *2) = 1
        System.out.println(module);
      //  System.out.println(num1 % num2);
        System.out.println(num1/num2);
    }
}
