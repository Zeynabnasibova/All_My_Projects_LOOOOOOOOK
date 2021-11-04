package replit.methodsWithReturn;

import java.util.Scanner;

public class ReverseLetters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here


        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){

            reverse += "" + str.charAt(i);


        }
        return reverse;


    }

}
/*
Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---"

Output:  str = "----dgf--y--tre...wq.---"
 */