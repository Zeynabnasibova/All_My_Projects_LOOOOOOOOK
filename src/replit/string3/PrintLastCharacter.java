package replit.string3;

public class PrintLastCharacter {
    public static void main(String[] args) {

        /*
        Write a program that will print out last letter of the word (string).

Ex:

Input: java

Output: a
         */

        String str = "java";

        String lastLeter = str.substring(str.length()-1);
        System.out.println("lastLeter = " + lastLeter);
        int lastLeterIndex = str.length()-1;
        System.out.println(lastLeterIndex);

    }
}
