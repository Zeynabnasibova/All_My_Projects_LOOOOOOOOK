package replit.array;

import java.util.Scanner;

public class Arrays008Has55 {

    public static void main(String[] args) {

        /*
Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array. If no consecutive 5s or no 5s are detected in your code then print false.

nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false

         */


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        boolean bl = false;

        for (int i = 0; i < nums.length - 1; i++) {

            if(nums[i]==5 && nums[i + 1] == 5){

                bl = true;

            }

        }

        System.out.println(bl);


    }
}
