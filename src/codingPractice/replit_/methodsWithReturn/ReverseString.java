package codingPractice.replit_.methodsWithReturn;

import java.util.Scanner;

public class ReverseString {

    public static String reverse(String str){

        String reverse = "";

        for (int i =str.length()-1; i >= 0; i--){

            reverse += "" + str.charAt(i);
        }
        return reverse;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }


}
/*
The reverse method will reverse the given String

Example:

reverse("foo") ==> "oof"

reverse("student") ==> "tneduts"

 */