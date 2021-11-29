package practiceAllInterviewCodingTasksSaim;

import java.util.Arrays;

public class ArrayConcatTwoArray {

/*
Write a return method that can concat two arrays
 */

    public static int [] concat(int [] arr1,int [] arr2){

        int [] concat = new int [arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){

            concat[i] = arr1[i];

        }

        for(int i = 0; i < arr2.length; i++){

            concat[arr1.length + i] = arr2[i];

        }

        return concat;
    }


    public static void main(String [] args){

        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }


}
