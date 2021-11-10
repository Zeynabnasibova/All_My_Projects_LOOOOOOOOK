package codingBatRepeat.Array1;

import java.util.Arrays;

public class MiddleWay {


    public static void main(String[] args) {

        MiddleWay obj = new MiddleWay();

        int [] a = {1, 2, 3};
        int [] b = {4, 5, 6};


        System.out.println(Arrays.toString(obj.middleWay(a, b)));


    }


    public int[] middleWay(int[] a, int[] b) {

        int [] newAB = new int [] {a[1], b[1]};

        return newAB;

    }


}
/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */