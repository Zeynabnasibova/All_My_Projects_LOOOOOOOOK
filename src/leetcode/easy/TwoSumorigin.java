package leetcode.easy;

import java.util.Arrays;

public class TwoSumorigin {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int [] nums = {2, 4,7};
        int target = 11;
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));

    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
