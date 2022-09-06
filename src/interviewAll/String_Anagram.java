package interviewAll.april2022;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = input.nextLine();
        System.out.println("Enter your second word");
        String word2 = input.nextLine();

        System.out.println(isAnagram(word1, word2));
    }

    public static boolean isAnagram(String word1, String word2) {
        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split("");

        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        if (Arrays.equals(word1Arr, word2Arr)) {
            return true;
        }else{
            return false;
        }
    }
}
