package practice3;

import java.util.Arrays;

public class ArrayMoveZerosToTheEnd_ {
        /*
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
        public static void main(String[] args) {
            int []  arr = new int[] {1,0,2,0,3,0,4,0};

            System.out.println(Arrays.toString(moveZeroEnd(arr)));
        }
        public static int [] moveZeroEnd (int [] arr){

            int index = 0;

            for(int i = 0;i < arr.length; i++){
                if(arr[i] != 0){
                    arr[index++] = arr[i];
                }
            }
            for(int i = index; i < arr.length; i++){
                arr[index] = 0;
            }
            return arr;
        }
}
