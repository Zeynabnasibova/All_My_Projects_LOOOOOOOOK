package saimDayByDay.day38_MethodOverloading.practice;

public class MinNumInArray {

    /*
    Find min num in Array
     */

    public static int min(int [] numbers){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

        }
        return min;

    }

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4,5};
        System.out.println(min(numbers));
    }
}
