package SaimJavaInterviewCodingTasks;

public class ArrayFindMaximum1 {


    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }


}
/*
Write a method that can find the maximum number from an int Array
 */