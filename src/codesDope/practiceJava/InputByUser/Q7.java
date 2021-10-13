package codesDope.practiceJava.InputByUser;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {


        /*

        Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope
         */

      Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");

        String word1 = input.next();

        System.out.println("Enter your second word");

        String word2 = input.next();

        System.out.println(word1+word2);
    }
}
