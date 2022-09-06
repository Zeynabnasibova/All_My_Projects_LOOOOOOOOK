package codingPractice.codingBatRepeat.Array1;

import java.util.Arrays;

public class MakePI {

    public static void main(String[] args) {


        MakePI obj = new MakePI();

        System.out.println(Arrays.toString(obj.makePi()));
    }

    public int[] makePi() {


        int [] newArr = new int [3];
        newArr[0] = 3;
        newArr[1] = 1;
        newArr[2] = 4;


        return newArr;
    }

}
/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.


makePi() → [3, 1, 4]
 */