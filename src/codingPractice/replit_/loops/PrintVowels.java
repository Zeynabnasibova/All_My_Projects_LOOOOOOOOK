package codingPractice.replit_.loops;
import java.util.Scanner;
public class PrintVowels {

    public static void main(String[] args) {

        /*
        Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo

Input: huehuehuehue

Output: ueueueue
         */
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String vowel = "";

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i'){

                vowel += str.charAt(i);


            }

        }
        System.out.println(vowel);
    }
}
