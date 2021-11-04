package replit.array;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays020PrintShortestWord2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        //System.out.println(str);
        String [] strArr = str.split(", ");
       // System.out.println(Arrays.toString(strArr));

        String shortest = strArr[0];
        String allShortestWord = "";

        for(int i = 0; i < strArr.length; i++){

            if(strArr[i].length() < shortest.length()){

                shortest = strArr[i];
            }

        }

        for(int i = 0; i < strArr.length; i++){

            if(strArr[i].length() == shortest.length()){

                allShortestWord += strArr[i] + " ";

            }
        }
        System.out.println(allShortestWord);

       allShortestWord = allShortestWord.trim();

        String [] shortWordArr =allShortestWord.split(" ");

        System.out.println(Arrays.toString(shortWordArr));


    }

}
/*
Write a program that will find out shortest words in the given string str. If there are few words that are evenly short, print them all. Use split method in order to split str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */