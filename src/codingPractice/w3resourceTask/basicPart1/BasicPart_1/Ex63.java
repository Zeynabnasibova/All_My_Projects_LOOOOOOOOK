package codingPractice.w3resourceTask.basicPart1.BasicPart_1;
import java.util.Scanner;
public class Ex63 {
    /*
    63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
Sample Output:
Input the first number : 12
Input the second number: 13
Result: 13
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = input.nextInt();

        System.out.println("Enter num2");
        int num2 = input.nextInt();
        System.out.println(max(num1, num2));
    }

    public static int max(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        }
        if (num1 % 6 == num2 % 6) {

            return (num1 < num2) ? num1 : num2;
        }
        return (num1 > num2) ? num1 : num2;

    }
}