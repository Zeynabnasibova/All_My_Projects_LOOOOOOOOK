package SaimJavaInterviewCodingTasks;

import java.util.Arrays;

public class ArrayConcatTwoArray_ {

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(concatTwoArrays(arr1,arr2)));
    }
}
/*
Write a return method that can concate two arrays
 */
