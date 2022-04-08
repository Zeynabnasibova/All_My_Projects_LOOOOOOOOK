package practice3;

import java.util.Arrays;

public class ArrayFindMinimum1 {

    /*
Write a method that can find the maximum number from an int Array
 */
    public static void main(String[] args) {
        int arr [] = new int [] { 1, 2, 3};
        System.out.println(min1(arr));
        System.out.println(min2(arr));
    }
    public static int min1(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int min2(int [ ]arr) {
        Arrays.sort(arr);
        int min = arr[0];
        return  min;
    }
}
