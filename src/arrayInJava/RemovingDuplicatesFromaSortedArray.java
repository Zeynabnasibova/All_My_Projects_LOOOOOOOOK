package arrayInJava;

import java.util.Arrays;

public class RemovingDuplicatesFromaSortedArray {
    /**
     2. Remove duplicate elements from array using temporary array

     If we are not allowed to use collections API (e.g. in a Java interview), we can use one of these approaches according to the question.

     2.1. Removing duplicates from a sorted array

     If array elements are sorted already then removing duplicates involve following steps:

     Create a new array 'tempArray' with same size as original array 'origArray'.
     Iterate over array starting from index location ‘0’.
     Match current element with next element indexes until mismatch is found.
     Add element to 'tempArray' and make current element to eleemnt which was mismatched.
     Continue the iteration.
     RemoveDuplicateExample.java
     */

    public static void main(String[] args) {
// Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };

        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));//[1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8]

        Integer[] tempArray = removeDuplicates(origArray);

        // Verify the array content
        System.out.println(Arrays.toString(tempArray));//[1, 2, 3, 4, 5, 6, 7, 8, null, null, null, null, null]
    }

    private static Integer[] removeDuplicates(Integer[] origArray) {

        Integer[] tempArray = new Integer[origArray.length];

        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++)
        {
            Integer currentElement = origArray[indexI];

            if (currentElement != origArray[indexI+1]) {
                tempArray[indexJ++] = currentElement;
            }
        }

        tempArray[indexJ++] = origArray[origArray.length-1];

        return tempArray;

    }
}
