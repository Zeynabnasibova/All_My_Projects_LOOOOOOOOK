package replit.method;

import java.util.Arrays;
import java.util.Scanner;
public class SwitchElements {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr [] = {input.nextInt(),input.nextInt(), input.nextInt(),input.nextInt()};
      //  int [] arr = new int [] {1, 2, 3, 4};

        System.out.println(Arrays.toString(do_switch(arr)));
    }

public static int []  do_switch(int [] arr){

    int [] newArr = new int [arr.length];

    newArr[0] = arr[arr.length -1];
    newArr[newArr.length-1] = arr[0];

    for(int i = 1; i < arr.length-1; i++){


        newArr[i] = arr[i];

    }
    return newArr;
    }

}
/*
Implement the do_switch method Switch the last element in an array with the first and return the array.

Examples:

do_switch([1,2,3,4])

returns:[4,2,3,1]

do_switch([7,2,3,5])

returns:[5,2,3,7]
 */