package codingPractice.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 4,7};
        int target = 6;
        System.out.println(Arrays.toString(findTwoSum(nums,target)));
    }

    // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}