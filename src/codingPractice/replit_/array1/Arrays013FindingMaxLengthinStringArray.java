package codingPractice.replit_.array1;
import java.util.Scanner;
public class Arrays013FindingMaxLengthinStringArray {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        String longest = words[0];

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > longest.length()){

                longest = words[i];
            }
        }
        System.out.println(longest);
    }
}
/*
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */