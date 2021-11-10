package replit.OOP;

import java.util.Scanner;

public class findMax {


    public static int findMax(int[]arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static double findMax(double[]arr){
        double max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }
}
/*
In this task, you need to write 2 overloaded methods findMax() that will find a maximum number in the array. First version should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.

Methods must have the same name and different parameters.
 */