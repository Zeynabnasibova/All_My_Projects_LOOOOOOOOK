package inerviewJavaTaskLeyla;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reverse = "";

        for(int i = sentence.length()-1; i >= 0; i--){

            reverse += sentence.charAt(i);


        }
        System.out.println(reverse);
    }
}
