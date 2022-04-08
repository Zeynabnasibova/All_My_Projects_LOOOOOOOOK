package practice3;

import java.util.Arrays;

public class ArrayConcatTwoArray {
    /*
Write a return method that can concat two arrays
*/
    public static void main(String [] args){
        int arr1 [] = new int [] {1,2};
        int arr2[] = new int [] {3, 4};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }
    public static int [] concat(int [] arr1, int arr2 []){
        int [] concat = new int [arr1.length + arr2.length];

        for(int i = 0; i < arr1.length;i++){
            concat[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length;i++){
            concat[arr1.length + i] = arr2[i];
        }
        return concat;

    }
}
