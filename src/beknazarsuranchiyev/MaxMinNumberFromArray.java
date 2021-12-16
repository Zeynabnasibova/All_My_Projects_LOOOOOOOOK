package beknazarsuranchiyev;

public class MaxMinNumberFromArray {

/**
 6.Max/min number from an array. Write a method that will accept an array of int as an argument and it will return the max/min number from a given array.
 */


public static void maxMin(int [] arr){

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i = 0; i < arr.length; i ++){

        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min ){
            min = arr[i];
        }
    }
    System.out.println("Minuimum number = " + min);
    System.out.println("Maximum number = " + max);

}

    public static void main(String[] args) {

    int [] arr = {1, 2, 3, 4, 5};

     maxMin(arr);
    }
}
