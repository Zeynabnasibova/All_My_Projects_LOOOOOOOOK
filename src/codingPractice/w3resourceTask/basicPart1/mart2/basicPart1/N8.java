package codingPractice.w3resourceTask.basicPart1.mart2.basicPart1;
import java.util.Scanner;
public class N8 {
    /*
    8.
    /* 37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT  */

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = input.nextLine();
        String reverse = "";
        for(int i = str.length() -1 ; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed String \n" + reverse);
    }
}
