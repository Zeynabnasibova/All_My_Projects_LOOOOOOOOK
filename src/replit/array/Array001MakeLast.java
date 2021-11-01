package replit.array;
import java.util.Scanner;
import java.util.Arrays;

public class Array001MakeLast {

    public static void main(String[] args) {
        /*
        Given an int array nums print a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Hint: by default, a new int array contains all 0's.

Examples:

input: 4 5 6

output: [0, 0, 0, 0, 0, 6]

input: 0

output: [0, 0]

input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int size = input.nextInt();
        int [] nums = new int [size];

        for(int i = 0; i < size; i++){

            System.out.println("Enter your number: " + (i + 1));

            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
      //  int [] nums  = new int [] {4, 5, 6};

        int [] newNums =  new  int [nums.length * 2];

        newNums [newNums.length-1] = nums [nums.length-1];


        System.out.println(Arrays.toString(newNums));




    }
}
