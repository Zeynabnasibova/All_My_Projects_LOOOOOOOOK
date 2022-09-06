package codingPractice.replit_.string3;
import java.util.Scanner;
public class PrintTheLongestWord {

    public static void main(String[] args) {


        /*
Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different

input:
bill
check

output: check
         */


        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();

        if(word1.length()>word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }


    }
}
