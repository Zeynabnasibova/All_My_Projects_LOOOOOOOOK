package replit.String3;

public class DuplicateIt {

    public static void main(String[] args) {

        /*
        You have 2 words

Print the first word, second word, second word, first word

Input:

one

two

Output:

onetwotwoone
         */

        String word1 = "one";
        String word2 = "two";

        System.out.println(word1 + word2 + word2 + word1);

        System.out.println(word1.concat(word2).concat(word2).concat(word1));


    }
}
