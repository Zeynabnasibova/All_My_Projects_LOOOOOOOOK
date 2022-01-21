package canvasOCASertification;

import java.util.Arrays;

public class N1 {

    public static void main(String[] args) {

        int [] num = {1, 2, 3};
        //System.out.println(num);
       // System.out.println(Arrays.toString(num));

        int [] [] arr = new int [] [] {{1,2},{3,4}};
        arr[1] = arr[0];
        System.out.println(Arrays.toString(arr[1]));


      //  int [] [] arr = new int [2] [2] ;

//        arr[0][0] = 1;
//        arr[0][1] = 2;
//
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//
//
      // System.out.println(arr);
        System.out.println(Arrays.deepToString(arr));
      //  System.out.println(Arrays.toString(arr[1]));
    }
}
