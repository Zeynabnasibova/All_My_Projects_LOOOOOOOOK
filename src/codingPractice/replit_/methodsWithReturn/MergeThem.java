package codingPractice.replit_.methodsWithReturn;
import  java.util.Scanner;
public class MergeThem {

public static String mergeStrings(String str1, String str2){

    String merge = "";
    if(str1.length() > str2.length()){
        for(int i = 0; i < str2.length();i++){

            merge += "" + str1.charAt(i) + str2.charAt(i);
        }
        merge += str1.substring(str2.length());

    }else if(str2.length() > str1.length()){

        for(int i = 0; i < str1.length(); i++){

            merge += "" + str1.charAt(i) + str2.charAt(i);

        }

        merge += str2.substring(str1.length());

    }else{

        for(int i = 0; i < str1.length(); i++){

            merge += "" + str1.charAt(i) + str2.charAt(i);
        }
    }

return merge;

}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}
/*
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */