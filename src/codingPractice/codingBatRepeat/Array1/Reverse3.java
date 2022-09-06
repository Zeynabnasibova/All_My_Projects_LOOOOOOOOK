package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class Reverse3 {

    public static void main(String[] args) {

        Reverse3 obj = new Reverse3();

        int [] nums = {1, 2, 3};

        System.out.println(Arrays.toString(obj.reverse3(nums)));

    }

    public int[] reverse3(int[] nums) {

        int [] newArr = new int [] {nums[2], nums[1], nums[0]};

        return newArr;

    }

}
