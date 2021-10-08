package arrayInJava;

import java.util.Arrays;

public class RemovingDuplicatesFromanUnsortedArray {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };

        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));

        Integer[] tempArray = removeDuplicates(origArray);

        // Verify the array content
        System.out.println(Arrays.toString(tempArray));
    }

    private static Integer[] removeDuplicates(Integer[] origArray) {

        for (int j = 0; j < origArray.length - 1; j++) {
            for (int i = j + 1; i < origArray.length - 1; i++) {
                if (origArray[j] == origArray[i]) {
                    origArray[i] = null;
                }
            }
        }

        origArray[origArray.length - 1] = null;

        return origArray;
}
}
