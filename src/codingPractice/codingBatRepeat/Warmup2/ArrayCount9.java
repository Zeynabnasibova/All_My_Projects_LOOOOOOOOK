package codingPractice.codingBatRepeat.Warmup2;

public class ArrayCount9 {

/*
Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

    public static void main(String[] args) {

        int [] nums = new int [] {1, 2, 9};

        ArrayCount9 obj = new ArrayCount9();

        System.out.println(obj.arrayCount9(nums));

    }


    public int arrayCount9(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i ++){

            if(nums[i] == 9){

                 count++;
            }

        }

        return count;
    }


}
