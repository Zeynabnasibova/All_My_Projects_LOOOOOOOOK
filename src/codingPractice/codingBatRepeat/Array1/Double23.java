package codingPractice.codingBatRepeat.Array1;

public class Double23 {

    public static void main(String[] args) {


        Double23 obj = new Double23();
int nums [] = {1, 2, 3};
        System.out.println(obj.double23(nums));


    }

    public boolean double23(int[] nums) {
        if(nums.length < 2){
            return false;
        }else  if(nums.length == 2 && nums[0] == 2 && nums[1] == 2
                || nums[0] == 3 && nums[1] == 3){

            return true;

        }else{
            return false;
        }


    }


}
