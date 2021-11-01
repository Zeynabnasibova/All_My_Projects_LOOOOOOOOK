package replit.string3;
import java.util.Scanner;
public class HasAJava {
    public static void main(String[] args) {

        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true

input: cjavac++

output: true

input: c#javaruby

output: false
         */


        Scanner input = new Scanner(System.in);
        String word = input.next();

        if(word.startsWith("java") || word.substring(1).startsWith("java")){

            System.out.println(true);

        }else{

            System.out.println(false);
        }



    }
}
