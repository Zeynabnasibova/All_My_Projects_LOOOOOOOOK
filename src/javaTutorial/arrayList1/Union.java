package javaTutorial.arrayList1;

import java.util.Arrays;
import java.util.HashSet;

public class Union {

    public static void main(String[] args) {

        /**
         Learn to find the union between two arrays in Java using HashSet class. In set theory, the union (denoted by U) of a collection of sets is the set of all elements in the collection.

         For example, the union of two sets A and B is the set of all the elements which are either in A, or in B, or in both A and B.

         To get the union of two arrays, follow these steps:

         Push first array in a HashSet instance.
         Use addAll() method to add the elements of the second array into set.
         Similarly, add all the elements of more arrays in the set, if any.
         */


/*
1. Union between two integer arrays

Java program to get the union between two integer arrays and print the output.
 */

        Integer[] firstArray = {0,2,4,6,8};
        Integer[] secondArray = {1,3,5,7,9,};

        HashSet<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(firstArray));

        set.addAll(Arrays.asList(secondArray));

        System.out.println(set);
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        //convert to array
        Integer[] union = {};
        union = set.toArray(union);

        System.out.println(Arrays.toString(union));
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        /*
        2. Union between two string arrays

Java program to get the union between two string arrays and print the output.
         */


        String[] firstArray1 = {"A", "B", "C", "D"};
        String[] secondArray1 = {"D", "A", "E", "F"};

        HashSet<String> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(firstArray1));

        set1.addAll(Arrays.asList(secondArray1));

        System.out.println(set1);

        //convert to array
        String[] union1 = {};
        union1 = set1.toArray(union1);

        System.out.println(Arrays.toString(union1));
    }
}
