package codingPractice.codingBatRepeat.Warmup2;

public class noTriples {
    /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */




    public boolean noTriples(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length - 1; i ++){

            if(i + 2 <= nums.length - 1){

                if(nums[i] == nums[i + 1] && nums[i] == nums[i +2]){

                    return false;
                }
            }

        }

        return true;
    }

}
