package mart.w3resourceTask.basicPart1.mart2.basicPart1;

import java.util.Scanner;

public class N10 {
    /*
    10.

    41. Write a Java program to print the ascii value of a given character. Go to the editor
Expected Output
The ASCII value of Z is :90
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter");
        char ch = input.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);

    }
}
