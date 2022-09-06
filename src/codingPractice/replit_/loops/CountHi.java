package codingPractice.replit_.loops;
import java.util.Scanner;
public class CountHi {

    /*
    Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2

Example:

input: hi code java please

output: 1
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int count = 0;
        for(int i = 0;i < sentence.length()-1;i++){

            if(sentence.substring(i,i+2).contains("hi")){

                count++;


            }


        }
        System.out.println(count);

    }
}
