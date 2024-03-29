package javaTutorial.arrayInJava;

import java.util.Arrays;
import java.util.List;

public class CopyArrayRangeExample {


    public static void main(String[] args) {

        /**
         Java example to create subarray from array i.e. creating array slice. Learn to use Java 8 Arrays.copyOfRange() method along with converting the subarray to list object.
         */


        String[] names1 = {"Alex", "Brian", "Charles", "David"};

//Subarray from index '0' (inclusive) to index '2' (exclusive)
        String[] partialNames1 = Arrays.copyOfRange(names1, 0, 2);
// [Alex, Brian]

//Subarray to list
        List<String> namesList1 = Arrays.asList( Arrays.copyOfRange(names1, 2, names1.length) );

        System.out.println(namesList1);
// [Charles, David]


        /**
         1. Arrays.copyOfRange()

         Use this method to copy the specified range of the specified array into a new array. It takes 3 parameters – original array, initial index and final index to be copied.

         Syntax
         /**
         * @param <T> the class of the objects in the array
         * @param original the array from which a range is to be copied
         * @param from the initial index of the range to be copied, inclusive
         * @param to the final index of the range to be copied, exclusive.

        public static <T> T[] copyOfRange(T[] original, int from, int to) {
            return copyOfRange(original, from, to, (Class<? extends T[]>) original.getClass());
        }
        'to' index parameter can be greater than index length. No ArrayIndexOutOfBoundsException will be raised in this case.

        1.1. Array range copy example

        Copy array range examples

        */

        /**
         Java example to create subarray from array i.e. creating array slice. Learn to use Java 8 Arrays.copyOfRange() method along with converting the subarray to list object.
         */


        String[] names = {"Alex", "Brian", "Charles", "David"};         // [Alex, Brian]

        System.out.println(Arrays.toString(names));
        //[Alex, Brian, Charles, David]

//Copy till second name from with index '0'
        String[] partialNames = Arrays.copyOfRange(names, 0, 2);

        System.out.println(Arrays.toString(partialNames));
//[Alex, Brian]

//Copy all names from with index '2'
        String[] endNames = Arrays.copyOfRange(names, 2, names.length);

        System.out.println(Arrays.toString(endNames));
        //[Charles, David]

//Copy last 8 names start with index '2'
//No ArrayIndexOutOfBoundsException error
        String[] moreNames = Arrays.copyOfRange(names, 2, 10);

        System.out.println(Arrays.toString(moreNames));
        //[Charles, David, null, null, null, null, null, null]


        /**
        2. Subarray to Arraylist

        Java example to create arraylist from subarray. It is done in two steps:

        Create subarray from array with desired items.
        Convert array to list.

        2. Subarray to Arraylist

        Java example to create arraylist from subarray. It is done in two steps:

        Create subarray from array with desired items.
        Convert array to list.
        Array to sublist
        String[] names = {"Alex", "Brian", "Charles", "David"};

        //Array to sublist
        List<String> namesList = Arrays.asList( Arrays.copyOfRange(names, 0, 2) );    // [Alex, Brian]
         */

    }
}
