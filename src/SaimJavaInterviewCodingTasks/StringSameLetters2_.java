package SaimJavaInterviewCodingTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class StringSameLetters2_ {

    public static boolean Same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);

    }
}
 /*   Write a return method that check if a string is build out of the same letters as another string.

        Ex:  same("abc",  "cab"); -> true

        same("abc",  "abb"); -> false:

  */