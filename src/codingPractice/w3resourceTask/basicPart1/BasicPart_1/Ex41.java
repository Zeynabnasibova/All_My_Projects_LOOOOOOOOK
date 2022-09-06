package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

import java.util.Scanner;

public class Ex41 {
    /*
    41. Write a Java program to print the ascii value of a given character. Go to the editor
Expected Output
The ASCII value of Z is :90
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter");
        char ch = input.next().charAt(0);
        int chASCIIValue = ch;
        System.out.println("The ASCII value of Z is :"+chASCIIValue);
    }
}
