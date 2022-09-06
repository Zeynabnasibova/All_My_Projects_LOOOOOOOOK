package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class RotateLeft3 {

    public static void main(String[] args) {

        RotateLeft3 obj = new RotateLeft3();

        int [] nums = {1, 2, 3};
        System.out.println(Arrays.toString(obj.rotateLeft3(nums)));



    }

    public int[] rotateLeft3(int[] nums) {
        int []  newArr = new int [] {nums[1],nums[2],nums[0] };
        return newArr;
    }


}
