package SaimJavaInterviewCodingTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringFrequencyOfCharacters3_ {

    public  static  String  FrequencyOfChars(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int j=0; j<b.length();j++) {
            int count=0;

            for(int i=0; i<str.length(); i++) {

                if (str.substring(i, i + 1).equals("" + b.charAt(j))) {
                    count++;
                }
            }

            result+=b.substring(j, j+1)+count;

        }

        return result;

    }
}

/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

solution 1:
 */