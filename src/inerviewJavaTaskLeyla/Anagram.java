package inerviewJavaTaskLeyla;

import java.util.Arrays;

public class Anagram {


    //listen silnet

public static void main(String [] args){


    String str1 = "listen";
    String str2 = "silent";

    String [] str1Arr = str1.split("");
    String [] str2Arr = str2.split("");



    Arrays.sort(str1Arr);
    Arrays.sort(str2Arr);

    if (Arrays.equals(str1Arr,str2Arr)){

        System.out.println(true);

    }else{

        System.out.println(false);

    }



     }
}
