package codingPractice.replit_.string3;

public class PrefixAgain {
    public static void main(String[] args) {

        /*
        Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

Assume that the String is not empty and that n is in the range from 1 to str.length().

Examples:

input: abXYabc
input: 1

output: true

input: abXYabc
input: 2

output: true

input: abXYabc
input: 3

output: false
         */

        String str = "abXYabc";//abc
        int n = 3;
        String strPrefix = str.substring(0,n);//

       // if(str.substring(n).contains(strPrefix)){

            if(str.substring(1).contains(str.substring(0,1))){//bXYabc  a

            System.out.println(true);

        }else{

            System.out.println(false);
        }

    }
}
