package codingBatRepeat.Array1;

public class FirstLast6 {


    public static void main(String[] args) {

        FirstLast6 obj = new FirstLast6();

        int [] nums = {1, 2, 6};

        System.out.println(obj.firstLast6(nums));


    }


    public boolean firstLast6(int[] nums) {

        //int [] nums = {1, 2, 6}

            if(nums[0]==6 || nums[nums.length-1]==6){

                return true;

        }else{
                return false;
            }


    }

}
