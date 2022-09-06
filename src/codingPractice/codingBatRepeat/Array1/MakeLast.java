package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class MakeLast {

public static void main(String [] args){

    MakeLast obj = new MakeLast();

    int [] nums = {1, 2, 3};
    System.out.println(Arrays.toString(obj.makeLast(nums)));

}


    public int [] makeLast(int[]nums){

        int [] newArr = new int [nums.length * 2];

        newArr[newArr.length-1] = nums[nums.length -1];

        return newArr;

    }

}
/*

Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */