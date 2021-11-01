package replit.array;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays014PrintFirstAndLastChar2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String newWords = "";

        for(int i = 0; i < words.length; i++){

         newWords += words[i].substring(0,1) + words[i].substring(words[i].length()-1) + " ";

        }

        System.out.println(newWords);
        String [] arrNewWords = newWords.split(" ");

        System.out.println(Arrays.toString(arrNewWords));

    }

}
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below. Put each first and last letter in an array.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */
