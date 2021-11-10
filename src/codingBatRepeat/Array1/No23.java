package codingBatRepeat.Array1;

public class No23 {


    public static void main(String[] args) {

        No23 obj = new No23();

        int [] nums = {1, 2};

        System.out.println(obj.no23(nums));

    }



    public boolean no23(int[] nums) {

        if(nums.length == 2 && nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3 ){

            return true;

        }else{

            return false;

        }

    }

}
/*
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */