package javaTutorial.java67com.array_based_coding_Interview_questions;

public class N1 {

    /**
     * How to find the missing number in a given integer array of 1 to 100?
     * [n*(n+1)]/2.
     Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it from the sum of first n natural numbers, it will be the value of the missing element.
     Algorithm:
     Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
     Create a variable sum to store the sum of array elements.
     Traverse the array from start to end.
     Update the value of sum as sum = sum + array[i]
     Print the missing number as sumtotal – sum
     */
    public static int findDisappearedNumbers(int[] nums) {

        int n=nums.length;

        int sum=((n+1)*(n+2))/2;

        for(int i=0;i<n;i++) {

            sum = sum - nums[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 4, 5, 6};
        System.out.println(findDisappearedNumbers(a));
    }
}