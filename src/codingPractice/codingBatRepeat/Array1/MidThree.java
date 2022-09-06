package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class MidThree {

    public static void main(String[] args) {

        MidThree obj = new MidThree();

        int [] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(obj.midThree(nums)));

    }


    public int[] midThree(int[] nums) {

        int [] newNums = new int [] {nums[nums.length / 2 -1], nums[nums.length/2], nums[nums.length/2 + 1]};

        return newNums;
    }

}
/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */