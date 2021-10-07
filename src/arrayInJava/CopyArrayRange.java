package arrayInJava;

import java.util.Arrays;

public class CopyArrayRange {

    public static void main(String[] args) {

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



    }
}
