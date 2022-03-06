package mart.w3resourceTask.basicPart1.mart3.basicPart1;

import java.util.Scanner;

public class N11 {
    /*
    11.

    42. Write a Java program to input and display your password. Go to the editor
Expected Output
Input your Password:
Your password was: abc@12
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your Password:");
        String password = input.nextLine();
        System.out.println("Your password was: " + password);
    }

}
