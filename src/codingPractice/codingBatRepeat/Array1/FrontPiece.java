package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class FrontPiece {

    public static void main(String[] args) {


        FrontPiece obj = new FrontPiece();
        int nums [] = {1, 2, 3};
        System.out.println(Arrays.toString(obj.frontPiece(nums)));

    }


    public int[] frontPiece(int[] nums) {

        if(nums.length < 2){

            return nums;
        }else{

            int [] newArr = new int [2];

            newArr[0] = nums[0];
            newArr[1] = nums[1];

            return newArr;
        }

    }


}
