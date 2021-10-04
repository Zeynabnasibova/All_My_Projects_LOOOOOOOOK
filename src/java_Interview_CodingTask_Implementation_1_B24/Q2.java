package java_Interview_CodingTask_Implementation_1_B24;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {

        System.out.println(SameLetters());
    }
        /*
      Q2: String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

         */
public static boolean SameLetters(){

        String str1 = "abc";
        String str2 = "cab";

        char[] arr1 = str1.toCharArray();  //  first I convert the strings into char[] arrays

        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1); // Then I sort this array
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2); // check for equality




    }
}
