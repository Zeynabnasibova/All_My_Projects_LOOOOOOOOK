package SayadInterview;

public class Array_SumOfElementCloseTo0 {



         public static void main(String[] args) {
              int[]a = {-1, -2, 6, -3};//You are given an array [-23, 12, -35, 45, 20, 36] then the two elements would be -35 & 36 as their pair sum is 1 which is closest to 0. You can generate all the pair sums and validate yourself.
              System.out.println(getSumOfTwoClosestToZeroElements(a));
/*

-1 + - 2 = -3
-1 + 6 = 5
-1 - 3 = -4

-2 + 6 = 4
-2 - 3 = - 5

6 - 3 = 3

 */

         }

    /*
          return the sum of the two elements closest to zero

       ->   If there are two elements equally close to zero like -2 and 2,
consider the positive element to be "closer" to zero than the negative one.
  */
         public static int getSumOfTwoClosestToZeroElements(int[]a) {


    int b[] = new int[2];// int b[] = new int[]{-2,2};
    int z = 0;
          for (int i = 0; i < a.length; i++)//-2
            for (int j = i + 1; j < a.length; j++) {// 0 + 1 = 1 -> 2
        int sum = a[i] + a[j];//-2
        if (z == 0)
            z = sum;
        if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {
            z = sum;
            b[0] = a[i];
            b[1] = a[j];
        }
    }

               return z;


}

     }