package codingPractice.codingBatRepeat.Array1;

public class bhvb {


    public static void main(String[] args) {



   int [] nums = {1, 2, 3};

        int [] newNums = new int [nums.length];


        for(int i = 0; i < nums.length; i++){

            newNums[i] = nums[i];


        }
       /// System.out.println(Arrays.toString(newNums));

        for(int i = newNums.length-1; i >= 0; i--){

            int reverse = newNums[i];

            System.out.println(reverse);

        }

        }

    }
