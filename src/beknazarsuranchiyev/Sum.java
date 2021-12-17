package beknazarsuranchiyev;
import java.util.Arrays;
public class Sum {
    /**
     Sum. Write a method that accepts int[] array and an int number, find 2 elements in the array that sum is equal to the given int. Assume that an input array will have only one pair of numbers that sum equal to our given number. It will always have this pair. See input and output examples. I will use the Brute Force algorithm. If you have a better algorithm, please put it in the comments. I will be happy to see it.
     */

    public static int [] sum(int [] arr, int num ){

        int [] sumNumbers = new int [2];

        for(int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == num){

                    sumNumbers[0] = arr[i];
                    sumNumbers[1] = arr[j];
                }
            }
        }
        return sumNumbers;

    }

    public static void main(String[] args) {
        int [] arr =new int  [] {1, 2, 3, 4, 5, 6};
        int num = 6;
        System.out.println(Arrays.toString(sum(arr,num)));
    }

}
