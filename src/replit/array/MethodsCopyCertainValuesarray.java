package replit.array;

import java.util.Arrays;
import java.util.Scanner;
public class MethodsCopyCertainValuesarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {


        String newWords = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("e")) {

                newWords += arr[i] + " ";

            }

        }

        String [] fewValue = newWords.split(" ");

        return fewValue;
    }

}
/*
Finish the getWithE. Given a String array arr with the following elements

["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter e in them

You need to know how many element contain e and create array accordingly

Values in fewValues array need to be ["zero", "one","three"]

Examples:

arr -> ["aa", "be", "lol", "lel", "oreo"]

fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "fury", "spoon"]

fewValues ->["e", "hey", "bye"]
 */