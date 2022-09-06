package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

import java.util.Arrays;

public class Ex79 {
    public static void main(String [] args){
        int [] inArray = new int [] {20, 30, 40};
        int [] outArray = new int [inArray.length];

        for(int i = 0; i < inArray.length -1; i++){
            outArray[i] = inArray[i + 1];
        }
        outArray[inArray.length -1] = inArray[0];
        System.out.println(Arrays.toString(outArray));
    }
}
