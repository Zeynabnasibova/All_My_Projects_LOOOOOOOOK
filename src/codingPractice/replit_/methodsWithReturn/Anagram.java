package codingPractice.replit_.methodsWithReturn;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
    public static boolean isAnagram(String word1, String word2) {
        //String str1 = "listen";
      //  String str2  = "silnet";
//
//        String newWord1 = word1.toLowerCase();
//        String newWord2  = word2.toLowerCase();

        String [] str1Arr = word1.toLowerCase().split("");
        String [] str2Arr = word2.toLowerCase().split("");

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if(Arrays.equals(str1Arr,str2Arr)){

          return true;

        }else{

       return false;

        }
    }
}
