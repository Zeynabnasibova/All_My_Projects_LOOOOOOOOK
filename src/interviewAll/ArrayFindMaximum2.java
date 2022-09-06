package interviewAll;

import java.util.Arrays;

public class ArrayFindMaximum2 {
    public static int max(int [] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];

    }

    public static void main(String[] args) {
        int [] arr = new int []{1,2,3};
        System.out.println(max(arr));
    }
}
