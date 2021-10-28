package replit.loops;
import java.util.Scanner;
public class EachLetter {

    public static void main(String[] args) {



        /*

Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o

Input: zimbabwe
z
i
m
b
a
b
w
e

Input: wow!
w
o
w
!
         */

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for(int i = 0; i < str.length(); i ++){

            System.out.println(str.charAt(i));

        }



    }
}
