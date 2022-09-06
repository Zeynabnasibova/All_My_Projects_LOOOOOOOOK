package codingPractice.replit_.array1;
import java.util.Scanner;
public class Arrays022ReverseSentence2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String reverse = "";

        String [] arrSetence = sentence.split(" ");

        for(int i = arrSetence.length - 1; i >= 0; i--){


            reverse += arrSetence[i] + " ";

        }

        System.out.println(reverse);

    }

}

/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */