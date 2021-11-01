package replit.array;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays002FrontPiece {

    public static void main(String[] args) {


        /*
Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3

output: [1, 2]

input: 1

output: [1]

input: 4, 5, 4, 3, 8

output: [4, 5]
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your array size");

        int size = input.nextInt();

        int [] num = new int [size];

        for(int i = 0; i < size; i++){

            System.out.println("Enter your numbers " + (i +1) );

            num[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(num));

        if(size == 1) {

            int[] newAmsArr = new int[1];
            newAmsArr[0] = num[0];
            newAmsArr[0] = num[0];

            System.out.println(Arrays.toString(newAmsArr));

        }else if(size == 2){

            int[] newAmsArr = new int[2];
            newAmsArr[0] = num[0];
            newAmsArr[1] = num[1];

            System.out.println(Arrays.toString(newAmsArr));

        }else if (size > 2){


            int[] newAmsArr = new int[num.length / 2 ];

            newAmsArr[0] = num[0];
            newAmsArr[1] = num[1];

            System.out.println(Arrays.toString(newAmsArr));

        }
    }
}
