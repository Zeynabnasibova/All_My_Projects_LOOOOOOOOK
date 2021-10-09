package arrayList1;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

    public static void main(String[] args) {

        /**
         Learn to find the intersection between two arrays in Java using HashSet class. An intersection is a group of common items that belong to two different sets.

         To get the intersection of two arrays, follow these steps:

         Push first array in a HashSet instance.
         Use retainAll() method to retain only elements which are present in second array.
         */

        /*
        1. Intersection between two integer arrays

Java program to get the intersection between two integer arrays and print the output.
         */

        Integer[] firstArray1 = {0,1,2,3,4,5,6,7,8};
        Integer[] secondArray1 = {1,3,5,7,9};

        HashSet<Integer> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(firstArray1));

        set1.retainAll(Arrays.asList(secondArray1));

        System.out.println(set1);
        //[1, 3, 5, 7, 9]

        //convert to array
        Integer[] intersection1 = {};
        intersection1 = set1.toArray(intersection1);

        System.out.println(Arrays.toString(intersection1));
        //[1, 3, 5, 7, 9]



        /*
        2. Intersection between two string arrays

Java program to get the intersection between two string arrays and print the output.
         */
        System.out.println();


        String[] firstArray = {"A", "B", "C", "D"};
        String[] secondArray = {"D", "A", "E", "F"};

        HashSet<String> set = new HashSet<>();

        set.addAll(Arrays.asList(firstArray));

        set.retainAll(Arrays.asList(secondArray));

        System.out.println(set);
        //[A, D]

        //convert to array
        String[] intersection = {};
        intersection = set.toArray(intersection);

        System.out.println(Arrays.toString(intersection));
        //[A, D]
    }
}
