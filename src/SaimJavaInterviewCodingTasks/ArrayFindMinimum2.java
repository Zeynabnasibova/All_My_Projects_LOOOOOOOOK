package SaimJavaInterviewCodingTasks;

import java.util.Arrays;

public class ArrayFindMinimum2 {

    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }
}
/*
Write a method that can find the maximum number from an int Array
 */