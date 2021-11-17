package saimDayByDay.day38_MethodOverloading.practice;

public class MaxNumArray {
    /*
    find max number in array
     */

    public static int max(int [] numbers){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }

        }
        return max;

    }

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4,5};
        System.out.println(max(numbers));
    }
}
