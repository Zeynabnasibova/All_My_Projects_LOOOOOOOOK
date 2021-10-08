package arrayInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintArrayElements {

    public static void main(String[] args) {

/**
 Learn to print simple array as well as 2d array in Java. For 2D arrays or nested arrays, the arrays inside array will also be traversed to print the elements stored in them.

 1. Arrays.toString() to print simple arrays

 Recommended way to print the content of an array is using

 Arrays.toString().

 */


// An array of String objects
        String[] array = new String[] { "First", "Second", "Third", "Fourth" };

// Print the array
        System.out.println( Arrays.toString(array) );//[First, Second, Third, Fourth]

/**
 2. Arrays.deepToString() to print multi-dimensional array

 What will happen if somewhere in hierarchy another array is stored, like in case of array of arrays. Use Arrays.deepToString() to print array which contain other arrays i.e print 2D arrays.

 */

        String[] arr1 = new String[] { "Fifth", "Sixth" };
        String[] arr2 = new String[] { "Seventh", "Eight" };

// An array of array containing String objects
        String[][] arrayOfArray = new String[][] { arr1, arr2 };

// Print the nested array
        System.out.println(Arrays.deepToString(arrayOfArray));    //Correct way
// Program output   // [[Fifth, Sixth], [Seventh, Eighth]]

        System.out.println();
        /**
        3. Complete code

Below is the Java program to print single as well as nested arrays in Java.
         */
//A normal java list having four String objects
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        // Print the list in console
        System.out.println(list);  //[First, Second, Third, Fourth]

        // An array of String objects
        String[] array1 = new String[] { "First", "Second", "Third", "Fourth" };

        // Print the array using default toString method - Do not Use it
       System.out.println(array.toString());//[Ljava.lang.String;@12dacd1

        // Print the array using Arrays.toString() - "RECOMMENDED for simple arrays"
        System.out.println(Arrays.toString(array1));//[First, Second, Third, Fourth]

        String[] arr3 = new String[] { "Fifth", "Sixth" };
        String[] arr4 = new String[] { "Seventh", "Eigth" };

        // An array of array containing String objects
        String[][] arrayOfArray1 = new String[][] { arr3, arr4 };

        // Compare the different outputs

        // Print the array using default toString method
        System.out.println(arrayOfArray1);//[[Ljava.lang.String;@1ad086a

        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(arrayOfArray1));//[[Ljava.lang.String;@10385c1, [Ljava.lang.String;@42719c]

        // Print the array using Arrays.deepToString() -  "RECOMMENDED for multi-dimensional array"
        System.out.println(Arrays.deepToString(arrayOfArray1));//[[Fifth, Sixth], [Seventh, Eigth]]

        /**
         * n this example, we learned how to print array in Java without loop, which looks really ugly. We learned to print array using Arrays.toString() and print 2D arrays using Arrays.deepToString().
         */
    }
}