package replit.array1;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays021ReverseArray {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};



int half = 0;

    for(int i = nums.length - 1;  i >= 0; i--){

       // System.out.print(nums[i] + ", ");

       int temp = nums[i];

       nums[i] = nums[nums.length - (i+1)];

       nums[nums.length - (i+1)]  = temp;

       half++;

       if(half == nums.length/2){

           break;
       }

    }
        System.out.println(Arrays.toString(nums));

   }
}
/*
Given an array nums with 7 integers already assigned, write code to reverse it.

Do not use any additional arrays or Strings.

Example:

nums -> [4, 3, 2, 44, 1, 100, 55]

nums -> [55, 100, 1, 44, 2, 3, 4]

PseudoCode:

Take values at index 0 and last index and swap them
Take values at index 0+1 and last index-1 and swap them
Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)
How to swap values:

int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;
 */