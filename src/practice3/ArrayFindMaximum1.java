package practice3;

import java.util.Arrays;

public class ArrayFindMaximum1 {
      /*
Write a method that can find the maximum number from an int Array
 */
      public static void main(String[] args) {
          int [] arr = new int [] {1, 2, 3};
          System.out.println(max1(arr));
          System.out.println(max2(arr));
      }
      public static int max1(int [] arr){
          int max = Integer.MIN_VALUE;
          for(int i = 0; i < arr.length; i++){
              if(arr[i] > max){
                  max = arr[i];
              }
          }
          return max;
      }
      public static int max2(int arr []){
          Arrays.sort(arr);
          int max = arr[arr.length-1];
          return max;

      }


}
