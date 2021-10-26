package replit.String3;

public class PrintFirstAndLastLeters {

    public static void main(String[] args) {

        /*
        Write a program that will print out first and last letters together.

Input: adobe

Output: ae
         */

        String str = "java";

        System.out.println(str.substring(0,1) + str.substring(str.length()-1));




    }
}
