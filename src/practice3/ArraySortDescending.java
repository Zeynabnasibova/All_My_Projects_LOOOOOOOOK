package practice3;

import java.util.Arrays;

public class ArraySortDescending {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(sortDescending(arr)));
    }
    public static int []  sortDescending(int [] arr){
        int temp =0;
        for(int i = 0; i < arr.length; i++){
            for(int j =i; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
