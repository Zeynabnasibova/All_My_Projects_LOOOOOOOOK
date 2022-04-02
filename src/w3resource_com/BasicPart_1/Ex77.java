package w3resource_com.BasicPart_1;

import java.util.Arrays;

public class Ex77 {
    public static void main(String [] args){
        int [] arr1 = new int []{1,2,3};
        int [] arr2 = new int []{4,5,6};
        int [] newArr = new int [2];
        newArr[0] = arr1[0];
        newArr[1] = arr2[2];
        System.out.println(Arrays.toString(newArr));
    }
}
