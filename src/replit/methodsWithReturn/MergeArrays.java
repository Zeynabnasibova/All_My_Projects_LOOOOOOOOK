package replit.methodsWithReturn;

import java.util.Arrays;

public class MergeArrays {

public static int [] mergR(int [] arr1,int [] arr2){

    int [] mergArray = new int [arr1.length + arr2.length];

    int count =0;
    for(int i =0; i < arr1.length; i++){

        mergArray[i] = arr1[i];

        count++;
    }

    for(int i = 0; i < arr2.length;i++){

        mergArray[count] = arr2[i];
        count++;
    }
    return mergArray;


}

    public static void main(String[] args) {
    int  [] arr1 = new int [] {1, 2, 3};
    int [] arr2 = new int [] {4, 5, 6};

        System.out.println(Arrays.toString(mergR(arr1,arr2)));
    }
}
/*

mergR merges two arrays into one. It gets two int arrays and returns an int array

Example:

mergR([1,2,3],[4,5,6])

returns [1,2,3,4,5,6]

mergR([1,2],[6,8])

returns [1,2,6,8]

hint:

create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
 */