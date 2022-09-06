package javaTutorial.refreshjavaCom.JavaArrays;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {
        int[] marks = new int[5];
        for(int i=0; i<5; i++){
            marks[i] = i;
        }
        System.out.println(marks.length);
        System.out.println(Arrays.toString(marks));

        int [] apple = new int [] {10, 20, 30,40,50};
        for(int i=0; i<5; i++) {
            System.out.println("Element at index " + i + " = " +apple[i]);

        }
    }
}