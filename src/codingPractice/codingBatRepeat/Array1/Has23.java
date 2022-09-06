package codingPractice.codingBatRepeat.Array1;

public class Has23 {


    public static void main(String[] args) {

        Has23 obj = new Has23();

        int [] nums = {1, 2, 3};
        System.out.println(obj.has23(nums));


    }
    public boolean has23(int[] nums) {

        if(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] ==3 ){

            return true;

        }else{
            return false;
        }


    }


}
