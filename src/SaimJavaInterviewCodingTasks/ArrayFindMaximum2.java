package SaimJavaInterviewCodingTasks;

import java.util.Arrays;

public class ArrayFindMaximum2 {


    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }
}
/*
Write a method that can find the maximum number from an int Array
 */