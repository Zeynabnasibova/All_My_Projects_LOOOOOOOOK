package interviewAll;

public class FindMissingNumber2 {
    public static void main(String[] args) {

        int [] nums = {0,1,2,3,5,6};
        System.out.println(missingNumber(nums));

    }



    public static int missingNumber(int[] nums) {// int [] nums = {1,2,3,5,6}

        int sum = 0;//13
        int expected = (1+ nums.length) * nums.length / 2;//6 * 5 / 2 = 15
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
        }
        return expected - sum;
    }
}


