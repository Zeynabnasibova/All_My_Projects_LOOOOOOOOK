package codingPractice.codingBatRepeat.Array1;

public class Unlucky1 {

    public static void main(String[] args) {

        Unlucky1 obj = new Unlucky1();

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(obj.unlucky1(nums));


    }


    public boolean unlucky1(int[] nums) {

            if (nums.length < 2) {

                return false;

            } else if (nums[0]==1 && nums[1] == 3 || nums[nums.length -2] == 1 && nums[nums.length -1] == 3 || nums[1] == 1 && nums[2] == 3) {

                return true;

            }else{

                return false;
            }

        }
    }
/*

We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */