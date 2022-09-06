package codingPractice.replit_.array1;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays009ShiftLeft {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arrayz size");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number:" + (i+1));
            nums[i] = scan.nextInt();

        }
            //int [] nums = new int [] {6, 2, 5, 3}

        int [] newNums = new int [size];
        if(nums.length == 1){

            newNums = nums;

        }else{

            for(int i = 0; i < nums.length-1; i++){

                newNums [i] = nums [i +1];

                newNums[newNums.length-1] = nums[0];


            }

            System.out.println(Arrays.toString(newNums));
        }
    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
 */