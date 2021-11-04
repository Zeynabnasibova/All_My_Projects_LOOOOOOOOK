package replit.methodsWithReturn;
import java.util.Scanner;
public class BiggerString {

    public static String bigger(String str1, String str2){

        String longest = str1;

        if(str1.length()> str2.length()){

            longest = str1;

        }else{

            longest = str2;
        }
        return longest;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }
}
/*
The method accepts two strings and return the longest one

Example":

bigger("apple","orange") ==> "orange"
 */