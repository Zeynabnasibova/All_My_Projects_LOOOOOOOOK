package w3resource_com.BasicPart_1;

import java.util.Scanner;

public class Ex67 {
    /*
    67. Write a Java program to insert a word in the middle of the another string.
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:
Python Tutorial 3.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();//Phyton 3.0
        System.out.println("Enter your new word");
        String newWord = input.nextLine();//Tutorial
        String [] strArr = str.split(" ");
        String together = strArr[0] + " " + newWord +" " + strArr[1];
        System.out.println(together);
    }
}