package B24InterviewTask.Part4;

import java.util.Arrays;

public class Concat {

    /*
    1. Array -- Concat two arrays:
Write a return method that can concate two arrays.

     */


    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3};

        int [] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(conCat(arr1,arr2)));
    }


    public static int [] conCat(int [] arr1, int [] arr2){

        //int lentArr1 = arr1.length;
        //int lentAtt2 = arr2.length;

        int [] result = new int [ arr1.length + arr2.length ];

        int pos = 0;

        for(int eachArr: arr1){

            result[pos++] = eachArr;

            //pos++;

        }
        for( int eacArr: arr2){

            result[pos++] = eacArr;

        }

        return result;

    }
}
