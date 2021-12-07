package SaimJavaInterviewCodingTasks;

import java.util.Arrays;
import java.util.Collections;

public class StringFindTheUnique2_ {


    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }


}






    /*
    Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

