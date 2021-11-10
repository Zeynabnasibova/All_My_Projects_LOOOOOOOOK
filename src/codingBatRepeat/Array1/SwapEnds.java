package codingBatRepeat.Array1;

import java.util.Arrays;

public class SwapEnds {


    public static void main(String[] args) {

        SwapEnds obj = new SwapEnds();
        int nums [] = {1, 2, 3};
        System.out.println(Arrays.toString(obj.swapEnds(nums)));



    }

    public int[] swapEnds(int[] nums) {
        if(nums.length == 1){

            return nums;

        }else {

            nums[0] = nums[0] + nums[nums.length -1];

            nums[nums.length -1] = nums[0] -   nums[nums.length -1];

            nums[0] = nums[0] - nums[nums.length -1];

            return nums;
        }
    }
}
