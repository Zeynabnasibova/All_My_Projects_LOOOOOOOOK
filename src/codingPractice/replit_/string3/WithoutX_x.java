package codingPractice.replit_.string3;

public class WithoutX_x {
    public static void main(String[] args) {


        /*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi

input: apple

output: apple

input: xUxL

output: UxL

input: JavaX

output: Java
         */

        String word = "JavaX";

        if(word.substring(0,1).equals("x") && word.substring(word.length()-1).equals("X")) {

            System.out.println(word.substring(1, word.length() - 1));
        }else if(word.substring(0,1).equals("x")) {
            System.out.println(word.substring(1));

        }else if(word.substring(word.length()-1).equals("X")){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }
    }
}
