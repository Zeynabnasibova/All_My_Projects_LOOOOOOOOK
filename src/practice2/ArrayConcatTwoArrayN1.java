package practice2;

import java.util.Arrays;
public class ArrayConcatTwoArrayN1 {


    //arrayConcatTwoArray

    public static int [] concatTwoArray(int [] arr1, int [] arr2){
        //int [] arr1 = new int [] {1, 2, 3};
        //int [] arr2 = new int [] {4, 5, 6};

        int [] newArr = new int [arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){

            newArr[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i ++){

            newArr[i + arr1.length] = arr2[i];

        }
        return  newArr;

    }

    public static void main(String [] args){
        int [] arr1 = new int [] {1, 2, 3};
        int [] arr2 = new int [] {4, 5, 6};
        System.out.println(Arrays.toString(concatTwoArray(arr1,arr2)));
    }
}
