package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex52 {
    /*
    52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
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
        Ex52 obj = new Ex52();
        System.out.println(obj.sum(num1,num2,num3));
    }
    public boolean sum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        } else {
            return false;
        }
    }
}