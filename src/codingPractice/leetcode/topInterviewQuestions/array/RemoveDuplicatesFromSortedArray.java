package codingPractice.leetcode.topInterviewQuestions.array;

public class RemoveDuplicatesFromSortedArray {
//
//        public int removeDuplicates(int[] nums) {
//
//            // Length of the updated array
//            int count = 0;
//            // Loop for all the elements in the array
//            for (int i = 0; i < nums.length; i++) {
//                // If the current element is equal to the next element, we skip
//                if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
//                    continue;
//                }
//                // We will update the array in place
//                nums[count] = nums[i];
//                count++;
//            }
//            return count;
//
//
//        }
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int [] nums = {1,2,2,2,3};
        System.out.println(obj.removeDuplicates(nums));
    }
}