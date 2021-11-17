package saimDayByDay.day38_MethodOverloading.practice;

public class CountElementsFrequencyOfElements {

    /*
    Create method that accepts an int array and a number count and return the number is found in the array

     */

    public static int frequencyOfElements(int [] arr, int numbers){

        int count = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == numbers){

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 1};
        int number = 1;
        System.out.println(frequencyOfElements(arr,number));
    }
}
