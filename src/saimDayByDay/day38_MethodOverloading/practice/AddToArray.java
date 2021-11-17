package saimDayByDay.day38_MethodOverloading.practice;

import java.util.Arrays;

public class AddToArray {

    /*
    Create a method that will accept an int array and number.
    We want to return a new array with the number added to the end of the array
    Input:
    {1,2,3}, 5
    [1, 2, 3, 5]
     */

    public static int [] addtoArray(int [] nums,int number){

        int[] newNums = new int [nums.length+1];
        for(int i = 0;i < nums.length; i++) {

            newNums[i] = nums[i];


        }
        newNums[newNums.length-1] = number;
        return newNums;
    }

    public static void main(String[] args) {

        int [] nums = {1,2,3};
        int number = 5;
        System.out.println(Arrays.toString(addtoArray(nums,number)));
    }
}
