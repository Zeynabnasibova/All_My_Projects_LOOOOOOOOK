package saimDayByDay.day38_MethodOverloading.practice;

public class SumArray {

    /*
    Create a method that will take an array and return the sum of all the elements
     */


    public static int sum(int [] nums){

        int sum = 0;
        for(int eachNums : nums){
            sum += eachNums;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3};

        System.out.println(sum(nums));
    }


}
