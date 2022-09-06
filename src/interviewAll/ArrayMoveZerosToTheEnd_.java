package interviewAll;

import java.util.Arrays;

public class ArrayMoveZerosToTheEnd_ {
        /*
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
 */

    public static int [] moveZerosToTheEnd(int [] arr){

        int index = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        for(int i = index; i < arr.length; i ++){
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
int [] arr = new int [] {0,8,0,7,0,1};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
    }
}
