package codingPractice.replit_.methodsWithReturn;

import java.util.Scanner;

public class PalindromeSEntence {

    public static boolean isPalindrome(String check){

        check = check.replace(" ","");

        String reverse = "";

        for (int i = check.length()-1; i >= 0; i--){

            reverse += "" + check.charAt(i);


        }
     if(reverse.equalsIgnoreCase(check)){

         return true;
     }else{

         return false;
     }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }

}
/*
Palindrome is a word, phrase, or sequence that reads the same backward as forward.

Example: madam
So method isPalindrome checks the given String and returns true if check is palindrome and false if it is not.

make your conditions case insensitive. ex: Civic and civic are both palindromes
make your conditions space insensitive. Race car is a palindrome even though there is space in between.
Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true
 */