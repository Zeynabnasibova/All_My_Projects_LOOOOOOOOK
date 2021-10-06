package arrayInJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConverArrayToListInJaa {

        public static void main(String[] args) {



/**

 Home / Java / Collections Framework / Java ArrayList / Convert array to list in Java
 Convert array to list in Java
 Last Modified: August 12, 2019

 Learn different and useful ways to convert array to list in Java. In this example, we will use Java 8 classes and Google guava library for creating an arraylist from elements of given array.

 1. Convert array to list – Immutable arraylist

 If you want to create an immutable arraylist instance backed by array elements then follow any given method below.

 1.1. Collections.unmodifiableList()

 Use Collections.unmodifiableList() to get a immutable list

 Create immutable arraylist from array
 */


            String[] namesArray = new String[] {"alex", "brian", "charles", "david"};

            List<String> namesList = Collections.unmodifiableList( Arrays.asList(namesArray) );

            System.out.println(namesList);//[alex, brian, charles, david]


            /**
             1.2. ImmutableList.copyOf()

             If you have guava library in project then you can use this method as well to get immutable list out of string array.

             Create immutable arraylist from array


             String[] namesArray1 = new String[] {"alex", "brian", "charles", "david"};

             List<String> namesList1 = ImmutableList.copyOf( namesArray1 );

             System.out.println(namesList1);

             */



            /**
             2. Convert array to list – Mutable arraylist

             If you want to create an mutable list instance backed by array elements then follow any given method below.

             2.1. Arrays.asList()

             Use Arrays.asList() to get a mutable list from a array of elements.

             Create list from array
             */


            String[] namesArray2 = new String[] {"alex", "brian", "charles", "david"};

            List<String> namesList2  = Arrays.asList(namesArray2) ;

            System.out.println(namesList2);//[alex, brian, charles, david]

/**
 2.2. Lists.newArrayList()

 Again, if you have guava library in project then you can use this method as well to get mutable arraylist from array.

 Create arraylist from array



 String[] namesArray3 = new String[] {"alex", "brian", "charles", "david"};

 ArrayList<String> namesList3 = Lists.newArrayList(namesArray3);

 System.out.println(namesList3);//[alex, brian, charles, david]

 */

        }
    }

