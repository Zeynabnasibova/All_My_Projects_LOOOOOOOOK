package januaryPractice.codingBatTask;

public class Pratice {
    public static void main(String[] args) {

        int[] nums = {1, 2, 9, 3, 4};
    }

    public boolean arrayFront9(int[] nums) {
        for(int i = 0; i < 4; i++){
            if(nums[i]==9)
                return true;
        }
        return false;
    }
}