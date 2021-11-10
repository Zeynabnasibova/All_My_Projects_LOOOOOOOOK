package replit.array1;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays0462DArraysLargestnumber2 {

public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your row size");
    int rows = input.nextInt();
    System.out.println("enter your columns size");
    int columns = input.nextInt();

    int [][] arr = new int [rows][columns];

    int max = Integer.MIN_VALUE;
    for(int i = 0; i < rows; i++){
        System.out.println("Enter " + (i+1) + "row");
        for(int j = 0; j < columns; j++){
            System.out.println("Enter " + (j+1) + "columns number");
            arr[i][j] = input.nextInt();

            if(arr[i][j] > max){

                max = arr[i][j];

            }

        }
    }
   // System.out.println(Arrays.deepToString(arr));
  //  System.out.println(max);

    for(int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {

            arr[i][j] = max;

        }


    }
    System.out.println(Arrays.deepToString(arr));
    }


}
/*
Given a 2d array of ints, find the biggest number(integer) and replace all array values on biggest number in the array then print an array.

Example:

Given values: [[1, 2, 3], [5, 33, 9]]

output: [[33, 33, 33], [33, 33, 33]]
 */