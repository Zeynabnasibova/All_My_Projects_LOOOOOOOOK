package codingBatRepeat.Array1;

public class MaxTriple {


    public static void main(String[] args) {

        MaxTriple obj = new MaxTriple();
        int []nums = {1, 2, 3};
        System.out.println(obj.maxTriple(nums));

    }
    public int maxTriple(int[] nums) {

        if(nums[0] > nums[nums.length/2 ] && nums[0] > nums[nums.length-1]){

            return nums[0];

        }else if(nums[nums.length/2 ]  > nums[0] && nums[nums.length/2 ]  > nums[nums.length-1]){

            return nums[nums.length/2 ] ;

        }else{

            return nums[nums.length-1];
        }

    }


}
