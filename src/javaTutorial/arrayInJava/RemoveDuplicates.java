package javaTutorial.arrayInJava;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        /**
         1. Remove duplicates from array using LinkedHashSet

         Using Java Collections, LinkedHashSet is one of the best approaches for removing the duplicates from an array. LinkedHashSet achieves two objectives :

         Removes the duplicate elements, as well as
         Maintains the ordering of elements
         Java program to remove duplicates in array using LinkedHashSet

         In given example, numbers is an integer array which has duplicate numbers 1, 3 and 5. We will add all elements from the array into the LinkedHashSet, and then we will convert the linkedhashSet to the array.

         The result array does not have duplicate integers.

         RemoveDuplicateExample.java
         */

        //Array with duplicate elements
        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};

        //This array has duplicate elements
        System.out.println( Arrays.toString(numbers) );//[1, 2, 3, 4, 5, 1, 3, 5]

        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );

        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );//[1, 2, 3, 4, 5]


    }
}
