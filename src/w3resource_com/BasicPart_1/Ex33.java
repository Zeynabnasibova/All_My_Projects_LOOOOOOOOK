package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex33 {
/*
33. Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();

        System.out.println(sumDigits(num));

    }
    public static int sumDigits(int num){
        int sum= 0;
        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;

    }
}
