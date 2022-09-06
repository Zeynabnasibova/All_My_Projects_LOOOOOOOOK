package codingPractice.replit_.methodsWithReturn;

import java.util.Scanner;

public class CountLetterN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
    //uniqueChar = abc
    //str = aaabbcccc


    public static String countLetters(String str){

        String result = "";

        String uniqueChar="";

        for(int i=0;i < str.length();i++){

            if(!uniqueChar.contains(""+str.charAt(i))){

                uniqueChar += ""+str.charAt(i);

            }
        }

        for(int i=0;i<uniqueChar.length();i++){

            int count =0;

            for(int j=0;j<str.length();j++){

                if(uniqueChar.charAt(i)==str.charAt(j)){

                    count++;
                }
            }

            result+=""+count+uniqueChar.charAt(i);

        }
        return result;

    }

}
/*
Write a method countLetters that can count letters in a given string and return a new string in the given format:

number of letters + letter

Example:

input: countLetters("aaabbcccc");

output: "3a2b4c"
 */
