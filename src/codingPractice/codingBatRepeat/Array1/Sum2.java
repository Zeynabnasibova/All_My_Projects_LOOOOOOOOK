package codingPractice.codingBatRepeat.Array1;

public class Sum2 {

    public static void main(String[] args) {

        Sum2 obj = new Sum2();
        int [] nums = {1, 2, 3};
        System.out.println(obj.sum2(nums));

    }

    public int sum2(int[] nums) {


        if(nums.length == 1){

            return nums[0];

        }else if(nums.length == 2){

            return nums[0] + nums[1];


        }else if (nums.length > 2){

            return nums[0] + nums[1];
        }else{
            return 0;
        }

    }

}
