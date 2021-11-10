package codingBatRepeat.Warmup2;

public class ArrayFront9 {

    public static void main(String[] args) {

        ArrayFront9 obj = new ArrayFront9();
        int [] nums =  {1, 2, 3};
        System.out.println(obj.arrayFront9(nums));


    }
    public boolean arrayFront9(int[] nums) {

        int size = nums.length;
        if(size > 4)
            size = 4;
        for(int i = 0; i < size; i++){

            if(nums[i] == 9) {

                return true;

            }
        }

        return false;
    }

    }
