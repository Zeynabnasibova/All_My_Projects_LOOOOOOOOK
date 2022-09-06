package codingPractice.replit_.loops;
import java.util.Scanner;
public class RepeatSeparator {

    public static void main(String[] args) {

 /*
 Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3

output: WordXWordXWord

Example:

input:
This
And
2

output: ThisAndThis

Example:

input:
This
And
1

output: This
  */

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String sep = input.nextLine();
        int num = input.nextInt();

        String container = "";

        if(word.length() > sep.length()){

            for(int i = 1; i < num; i++) {

                container += word + sep;//WordXWordXWordX

            }
        }
        container += word;

        System.out.println(container);

    }
}
