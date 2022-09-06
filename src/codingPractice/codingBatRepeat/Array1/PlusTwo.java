package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class PlusTwo {


    public static void main(String[] args) {
     PlusTwo obj = new PlusTwo();

     int [] a = {1, 2};
     int [] b = {3, 4};

        System.out.println(Arrays.toString(obj.plusTwo(a, b)));

    }


    public int [] plusTwo(int [] a , int [] b){

        int [] newArr = new int [a.length + b.length];

        newArr[0] = a[0];
        newArr[1] = a[1];
        newArr[2] = a[0];
        newArr[3] = a[1];

        return newArr;

    }
}
