package replit.array1;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays017Printing02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(arr));



        for(int i = 0; i < arr.length -1; i += 2){

        String newArr = arr[i] + ", " + arr[i+1];

            System.out.println(newArr);

        }


    }

}
/*
The code provided in your main method will take in eight Strings and save them into an array arr.

Print out the 4 lines using for loop: each line should contain a pair of array elements

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]

Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
 */

