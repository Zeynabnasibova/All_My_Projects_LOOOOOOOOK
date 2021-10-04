package java_Interview_CodingTask_Implementation_1_B24;

import java.util.Arrays;

public class Q2a {

    public static void main(String[] args) {

        /*
        Q2: String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

         */
        System.out.println(sameLetter("abc","bca"));

    }

    public static boolean sameLetter(String str1, String str2) {

//        String str1 = "abc";
//        String str2 = "cab";

        String[] arrStr1 = str1.split("");
        String[] arrStr2 = str2.split("");

        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        if (arrStr1.equals(arrStr2)) {

            return true;

        }else{

            return false;
        }
    }
}