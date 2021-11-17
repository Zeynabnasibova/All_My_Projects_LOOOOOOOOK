package saimDayByDay.day38_MethodOverloading.practice;

public class Contains {



    public static boolean contain(int [] nums, int number){

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == number){

                return true;

            }
        }
        return false;
    }
}
