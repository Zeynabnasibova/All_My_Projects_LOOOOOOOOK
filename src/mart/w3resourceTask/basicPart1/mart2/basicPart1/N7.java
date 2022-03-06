package mart.w3resourceTask.basicPart1.mart2.basicPart1;
import java.util.Scanner;
public class N7 {
    /*
    7.
33. Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output
The sum of the digits is: 7
 */

    public static  void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0){
            int remainder =  num % 10;
            sum += remainder;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
