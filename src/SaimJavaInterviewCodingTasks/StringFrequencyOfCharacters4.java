package SaimJavaInterviewCodingTasks;

import java.util.Arrays;
import java.util.Collections;

public class StringFrequencyOfCharacters4 {

    public static String frequency(String str) {

        String nonDup = "", result = "";

        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);


        for (int i = 0; i < nonDup.length(); i++) {

            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));

            result += "" + nonDup.charAt(i) + num;

        }


        return result;

    }
}
/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

solution 1:
 */