package practiceAllInterviewCodingTasksSaim;
import java.util.Arrays;
public class ArraySortAscending {

      /*
    Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);==>{ 7, 8, 9, 10};

     */
      public static void main(String[] args) {

int [] arr = new int [] {10, 9, 8, 7};

          System.out.println(Arrays.toString(ascending(arr)));
      }


    public static int [] ascending(int [] arr){

        int temp = 0;

        for(int i = 0; i < arr.length; i++){

            for(int j = i; j < arr.length; j++){

                if (arr[i] > arr[j]){

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }

            }
        }

        return arr;


    }


}
