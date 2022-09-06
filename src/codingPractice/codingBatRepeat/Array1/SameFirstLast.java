package codingPractice.codingBatRepeat.Array1;
import java.util.Scanner;
public class SameFirstLast {

public static void main(String [] args ){

    SameFirstLast obj = new SameFirstLast();

    Scanner input = new Scanner(System.in);
    int [] nums = new int [3];

    for(int i = 0; i < nums.length; i++){
        System.out.println("Enter your number " + (i + 1));
        nums[i] = input.nextInt();
    }

   // int [] nums = {1, 2, 3};

    System.out.println(obj.sameFirstLast(nums));

}


    public boolean sameFirstLast(int[] nums) {


        if(nums.length >= 1 && nums[0] == nums[nums.length-1]) {

            return true;


        }else{
            return false;


        }
    }


}
