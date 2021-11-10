package replit.array1;

import java.util.Arrays;
import  java.util.Scanner;
public class Arrays019InnerAndOuter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your outer size");
        int[] outer = new int[scan.nextInt()];
        System.out.println("Enter your inner size");
        int[] inner = new int[scan.nextInt()];

        for (int i = 0; i < outer.length; i++) {
            System.out.println("Enter your outer number "+ (i+1));
            outer[i] = scan.nextInt();
        }

        for (int j = 0; j < inner.length; j++) {
            System.out.println("Enter your inner number "+ (j+1));
            inner[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        int counterFound = 0;
        for(int innerItem: inner){

            for(int outerItem: outer){

                if(innerItem == outerItem){

                    counterFound++;

                    break;
                }
            }
        }
        System.out.println(counterFound == inner.length);
    }
}
/*
Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.

Examples:

input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true

input (outer): 1, 2, 4
input (inner): 6, 5

output: false
 */