package replit.method;

import java.util.Arrays;
import java.util.Scanner;
public class PopulateArray {

    public static int[] populate(int[] arr) {

        for(int i = 0; i < arr.length;i++ ){

            arr[i] = i +1;

        }

        return arr;

    }

    public static void main(String[] args) 	{
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] allNumber= new int[size];

        allNumber = populate(allNumber) ;

        System.out.println(Arrays.toString(allNumber));

    }
}



//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int[] arr = new int []{input.nextInt()};
//
//        populate(arr);
//    }
//
//    public static void populate(int [] num) {
//
//        //int [] num = 3;   // 1 2 3
//
//        int [] populate = new int [num.length];
//
////        for (int i = 0; i < num.length; i++){
////
////            populate[i] = i + 1;
////
////
////        }
//     for (int i = 0; i < num.length; i++){
//
//         System.out.println(num[i] + " ");
//     }
//
//    }
//
//}
/*
The populate method accepts an empty int array and populates it with numbers counting up.

Example:

populate(new int[3])

returns:[1,2,3]

populate(new int[5])

returns:[1,2,3,4,5]

hint:

use a for loop and use the iterator as the current elements value.
 */