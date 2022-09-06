package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class MakeEnds {

public static void main (String [] args ){

    MakeEnds obj = new MakeEnds();

    int [] nums = {1, 2, 3};

    System.out.println(Arrays.toString(obj.makeEnds(nums)));

}




    public int[] makeEnds(int[] nums) {

        int[] newArr = new int[]{nums[0], nums[nums.length - 1]};
        return newArr;
    }


    }
/*

Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */