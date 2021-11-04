package replit.method;

import java.util.Arrays;
import java.util.Scanner;

public class AddtoArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();
        System.out.println("Enter number");
        int num = input.nextInt();
        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter number of array " + (i+1));
            arr[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(add_to_r(arr,num)));
    }
        public static int[] add_to_r(int [] arr, int num){

            int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){

            newArr[i] = arr[i];

        }
        newArr[newArr.length -1 ] = num;
return newArr;
    }

}
/*
add_to_r is a method that accepts an array and a number.

The method takes the same value of the array but adds the given number into the array at the end. Note: The new number is added which means there is a size difference between the two arrays

Example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */
