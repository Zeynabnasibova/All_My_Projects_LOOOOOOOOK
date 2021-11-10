package codingBatRepeat.Warmup2;

public class Has271 {


    public static void main(String[] args) {


        Has271 obj = new Has271();
        int [] nums = {1, 2, 3};
        System.out.println(obj.has271(nums));

    }




    public boolean has271(int[] nums) {


        for (int i=0; i < nums.length-2; i++) {

            if (nums[i+1] == nums[i] + 5 && nums[i + 2] == nums[i] -1) {

                return true;

            }
        }
        return false;


    }


}
