package codingBatRepeat.Array1;

import java.util.Arrays;

public class BiggerTwo {

    public static void main(String[] args) {

        BiggerTwo obj = new BiggerTwo();
        int [] a = {1, 2} ;
        int [] b = {3, 4};
        System.out.println(Arrays.toString(obj.biggerTwo(a,b)));


    }


    public int[] biggerTwo(int[] a, int[] b) {

        if(a[0] + a[1] > b[0] + b[1]){

            return a;

        } else if (b[0] + b[1] > a[0] + a[1]){

            return b;

        }else{

            return a;
        }
    }

}
