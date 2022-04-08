package practice3;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        int [] arr = new int [] {17, 29, 8, 9};

        System.out.println(Arrays.toString (sortAscending(arr)));
    }
    public static int [] sortAscending (int [] arr){

        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
