package replit.string3;
import java.util.Scanner;
public class MiddleThree {

    public static void main(String []args){

        /*
        Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte

apple ==> ppl

hey ==> invalid

java ==> invalid

whatsup ==> ats

$ ==> invalid
         */

        Scanner input = new Scanner(System.in);
        String word = input.next();

        if(word.length() % 2 == 1 && word.length() >= 5){

            String middleThree = word.substring(word.length()/2 -1,word.length()/2+1) + word.substring(word.length()/2 +1,word.length()/2 +2);
            System.out.println(middleThree);

        }else{

            System.out.println("Invalid");
        }

    }
}
