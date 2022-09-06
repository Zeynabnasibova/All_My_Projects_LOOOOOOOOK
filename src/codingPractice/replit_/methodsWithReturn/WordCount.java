package codingPractice.replit_.methodsWithReturn;
import java.util.Scanner;
public class WordCount {


    public static int wordCount(String sentence){

        String [] strArr = sentence.split(" ");

      int word = strArr.length;

      return word;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}
/*
wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")

returns 2

wordCount("one two three")

returns 3

wordCount("bla")

returns 1

Hint: look at spaces
 */