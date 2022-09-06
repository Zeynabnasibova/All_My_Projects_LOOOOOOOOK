package interviewAll.beknazarsuranchiyev;

import java.util.Arrays;

public class ReverseIntArray1 {
    /**
     2.Array reverse. Write a method that will take an array as an argument and reverse it
     */

    public static void main(String[] args) {

        int[] array = {1, 2, 3};

        System.out.println("array before reverse: " + Arrays.toString(array) );

        for(int i = 0; i < array.length/2; i++){

            int temp = array[i];

            array[i] = array[array.length -i -1];

            array[array.length -i -1] = temp;
        }


        System.out.println("array after reverse: " + Arrays.toString(array) );

    }



}