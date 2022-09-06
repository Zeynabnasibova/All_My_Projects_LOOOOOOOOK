package codingPractice.w3resourceTask.basicPart1.BasicPart_1;
import java.util.Scanner;
public class Ex62 {
    /*
    62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.
Sample Output:
Input the first number : 15
Input the second number: 20
Input the third number : 25
false
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(Math.abs(num1 - num2) >= 20 || Math.abs(num2 - num3) >= 20 || Math.abs(num3 - num1) >= 20);
        System.out.println(ex(num1,num2, num3));
    }
    public static boolean ex(int num1, int num2, int num3) {
        if (num1 >= 20 && num1 < num2 - num3 || num2 >= 20 && num2 < num1 - num3 || num3 >= 20 &&  num3 < num1 - num2 ) {
            return true;
        }else{
            return false;
    }
    }
}
