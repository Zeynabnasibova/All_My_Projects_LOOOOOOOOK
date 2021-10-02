package ArrayInJava;

import java.util.Arrays;

public class JavaArrayCopyExample {

    public static void main(String[] args) {



        /**
         Java examples to copy an array to another array object using array clone, System.arrayCopy() and Arrays.copyOf() methods.

         Note that all given below approaches create shallow copy of array. To create deep copies of array, follow provided link.
         */

     /*
        String[] names = {"Alex", "Brian", "Charles", "David"};

// Use arr.clone() method - Recommended
        String[] cloneOfNames = names.clone();

// Use Arrays.copyOf() method - Most readable
        String[] copyOfNames = Arrays.copyOf(names, names.length);

//Using System.arraycopy() method - Equally efficient but less readable
        String[] copyOfNames2 = new String[names.length];
        System.arraycopy(names, 0, copyOfNames2, 0, copyOfNames2.length);

*/

        /**
        1) array.clone()

It is the most easy to use and recommended approach. It create the clone of array in single statement. Most developers are well aware of clone() functionality in general, so they can relate easily.
         Java Create Array Clone
         */

        String[] names = {"Alex", "Brian", "Charles", "David"};

// Use arr.clone() method - Recommended
        String[] cloneOfNames = names.clone();

        System.out.println(Arrays.toString(names));         //[Alex, Brian, Charles, David]
        System.out.println(Arrays.toString(cloneOfNames));  //[Alex, Brian, Charles, David]


/**
 * 2) Arrays.copyOf()
 *
 * This is super useful method and very clearly state it’s purpose. Make the code very much readable. I will recommend this as well.
 *
 * Arrays.copyOf() Example
 */System.out.println();

        String[] names1 = {"Alex", "Brian", "Charles", "David"};

// Use Arrays.copyOf() method - Most readable
        String[] copyOfNames1 = Arrays.copyOf(names1, names1.length);

        System.out.println(Arrays.toString(names1));         //[Alex, Brian, Charles, David]
        System.out.println(Arrays.toString(copyOfNames1));   //[Alex, Brian, Charles, David]


        /**
         3) System.arraycopy() – Recommended

         Another useful method provided by JDK. It is native method and is also invoked within Arrays.copyOf() method, internally. But it makes code a little less readable due to multiple arguments used for invocation.

         /**
         * @param      src      the source array.
         * @param      srcPos   starting position in the source array.
         * @param      dest     the destination array.
         * @param      destPos  starting position in the destination data.
         * @param      length   the number of array elements to be copied.
         */

        /**
        public static native void arraycopy(Object src,  int  srcPos,
        Object dest, int destPos,
        int length);
        Let’s see the example of arraycopy method.

                System.arraycopy() Example
        String[] names = {"Alex", "Brian", "Charles", "David"};

//Using System.arraycopy() method - Equally efficient but less readable
        String[] copyOfNames = new String[names.length];
        System.arraycopy(names, 0, copyOfNames, 0, copyOfNames.length);

        System.out.println(Arrays.toString(names));         //[Alex, Brian, Charles, David]
        System.out.println(Arrays.toString(copyOfNames));   //[Alex, Brian, Charles, David]


         */

    }
}
