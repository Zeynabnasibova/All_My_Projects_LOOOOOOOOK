package practiceAllInterviewCodingTasksSaim;
import java.util.Arrays;
public class StringSameLetters1 {

/*
    Write a return method that check if a string is build out of the same letters as another string.

    Ex:  same("abc",  "cab"); -> true

    same("abc",  "abb"); -> false:
            */


    public static boolean sameLater(String str1, String str2){

        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){

            return true;

        }else{

            return false;
        }

    }

    public static void main(String[] args) {
String str1 = "abc";
String str2 = "cab";
        System.out.println(sameLater(str1,str2));
    }
}
