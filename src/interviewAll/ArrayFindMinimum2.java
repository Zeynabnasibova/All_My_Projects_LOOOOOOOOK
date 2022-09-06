package interviewAll;

import java.util.Arrays;

public class ArrayFindMinimum2 {
    public static int min(int []arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3};
        System.out.println(min(arr));
    }
}
