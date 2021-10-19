package B24InterviewTask;

import java.util.Arrays;

public class SameLetter {

    //I call my method inside the main method
    //Which evaluated true or false
    public static void main(String[] args) {

        System.out.println(sameLetter("abc","cab"));

    }

    /**
     * Q2: String -- Same letters
     * Write a return method that check if a string is build out of the same letters as another string.
     * Ex: same("abc", "cab"); -> true
     * same("abc", "abb"); -> false:
     */

    public static boolean sameLetter(String first,String second){ //I am created my own method which return boolean value


        //First I convert the Strings in to charArrays
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        //Then I sort Array
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        //Then check for equality
        return Arrays.equals(firstArr,secondArr);

    }
}
