package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class Fix23 {

    public static void main(String[] args) {

        Fix23 obj = new Fix23();

        int [] nums = {1, 2, 3};

        System.out.println(Arrays.toString(obj.fix23(nums)));


    }


    public int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length; i++){

            if(nums[i] == 2  && nums[i + 1] == 3){

                nums[i + 1] = 0;

                return nums;
            }
        }

        return nums;
    }

}
