package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String [] str){
        TwoSum1 obj = new TwoSum1();
        int [] nums = {2, 4,7};
        int target = 6;
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }


  public int[] twoSum(int[] nums, int target) {
        // Array to store result
        int[] result = new int[2];
        // This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(nums[i])) {
                // Index of the current element
                result[0] = i;
                // Index of the other element of the pair
                result[1] = map.get(nums[i]);
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}