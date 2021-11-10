package replit.array1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays0402DArrayLargestNumber {



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your rows size");
        int rows = inp.nextInt();
        System.out.println("Enter your cols size");
        int cols = inp.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println(Arrays.deepToString(arr));

        int max = Integer.MIN_VALUE;

        for(int i=0 ;i < rows;i++){
            for(int j=0 ;j < cols;j++){
                arr[i][j]=inp.nextInt();


                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }//end for cols
        }//end for rows

        //TODO write your code below


        System.out.println(max);



    }//end main
}
/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */