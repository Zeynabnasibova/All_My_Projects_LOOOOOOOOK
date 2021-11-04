package inerviewJavaTaskLeyla;
import java.util.Scanner;
public class PolindromeString {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     String word = input.nextLine();
     String reverse = "";

     for(int i = word.length()-1; i >= 0; i--){

         reverse += word.charAt(i);


     }
     if(reverse.equals(word)){
         System.out.println("Palindrome");
     }else{
         System.out.println("Not palindrome");
     }
    }

}
