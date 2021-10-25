package B24InterviewTask.Part4;

import java.util.Arrays;

public class ConcatTwoArraysUsingArrayCopy {

    public static void main(String[] args) {

        int [] arr1  = new int [] {1, 2, 3};//initialized array
        int [] arr2 = new int [] {4, 5, 6};

        System.out.println(Arrays.toString(conCat(arr1,arr2)));// //prints the resultant array
    }


    public static int [] conCat(int arr1 [],int [] arr2){

        arr1  = new int [] {1, 2, 3};// we have integer array
        arr2 = new int [] {4, 5, 6};//integer array

        int  arr1Length = arr1.length;//determines length of firstArray
        int arr2Length = arr2.length;  //determines length of secondArray

        int [] result = new int [arr1Length + arr2Length];//add the length of firstArray into secondArray

        System.out.println(Arrays.toString(result));//[0, 0, 0, 0, 0, 0]

//to combine both, we copy each element in both arrays to result by using arraycopy() method
        System.arraycopy(arr1, 0, result, 0, arr1Length);// this one tells the programm to copy array1 starting from index 0 to result from index 0 to arr1length
        System.arraycopy(arr2, 0, result, arr1Length, arr2Length);//this one tells the program to copy array2 starting from index 0 to result from index arr1Length to arr2Length.


        return result;


    }
}
