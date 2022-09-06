package codingPractice.w3resourceTask.basicPart1.mart1.basicPart1;
import java.util.Scanner;
public class N2 {
    /*

7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Multiplacation table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i  +  " = " + (i * num));
        }

    }
}
