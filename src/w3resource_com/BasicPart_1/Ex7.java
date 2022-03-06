package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex7 {
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

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        for(int i = 0; i <= 10; i++){
            int multiple = i * num;
            System.out.println(num + " * " +  i+ " = " +  multiple );
        }

    }
}
