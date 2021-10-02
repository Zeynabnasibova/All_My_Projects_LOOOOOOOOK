package w3resource_com.BasicPart_1;

import java.util.Arrays;

public class Practice {


    public static void main(String[] args) {

        String sentence = "the quick brown fox jumps over the lazy dog.";

        String [] newStr = sentence.split(" ");

        System.out.println(Arrays.toString(newStr)); // [the, quick, brown, fox, jumps, over, the, lazy, dog.]

        System.out.println();

        char[] arr1 = sentence.toCharArray();

        System.out.println(arr1); //the quick brown fox jumps over the lazy dog.

    }
}
