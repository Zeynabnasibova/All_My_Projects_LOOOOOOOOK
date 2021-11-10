package replit.array1;

import java.util.Scanner;
public class Arrays024SplitSentence {

public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();

    //String sentence = "Java is fun";

    String [] arrSentence = sentence.split(" ");



    for(int i = 0; i < arrSentence.length; i++){

        String newSentence = arrSentence[i];

        System.out.println(newSentence);


    }

      }

}
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java
is
fun
 */