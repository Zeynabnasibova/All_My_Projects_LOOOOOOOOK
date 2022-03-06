package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex12 {
    /*
    12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
     */
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first num1");
        int num1 = input.nextInt();
        System.out.println("Enter your second num2");
        int num2 = input.nextInt();
        System.out.println("Enter your third num2");
        int num3 = input.nextInt();
        double average = (num1 + num2 + num3) / 3;
        System.out.println(average);
    }
}
