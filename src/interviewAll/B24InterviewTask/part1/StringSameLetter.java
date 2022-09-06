package interviewAll.B24InterviewTask.part1;

import java.util.Arrays;

public class StringSameLetter {

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
//
//        char [] charStr1 = str1.toCharArray();
//        char [] charStr2 = str2.toCharArray();

        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        if (Arrays.equals(arrStr1,arrStr2)){

            return true;

        }else{

            return false;
        }
    }
}