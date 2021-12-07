package SaimJavaInterviewCodingTasks;

public class ArrayFindMinimum1_ {

    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }

}
/*
Write a method that can find the maximum number from an int Array
 */