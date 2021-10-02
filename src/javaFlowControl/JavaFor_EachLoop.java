package javaFlowControl;

import java.util.ArrayList;
import java.util.List;

public class JavaFor_EachLoop {

    public static void main(String[] args) {

/**
 * Java 5 introduced an for-each loop, which is called a enhanced for each loop. It is used to iterate over elements of an array and the collection.
 *
 * for-each loop is a shortcut version of for-loop which skips the need to get the iterator and loop over iterator using it’s hasNext() and next() method.
 *
 * 1. Java for-each loop syntax
 *
 * The general syntax for a for-each loop is as follows:
 *
 * Syntax
 *
 * for(T element : a_collection_or_an_array_of_type_T){
 *
 *         // This code will be executed once for each element in the
 *         collection/array.
 *         // Each time this code is executed, the element variable holds the reference
 *         // of the current element in the collection/array
 *
 * }
 */


/**
 * 2. Java for-each loop example – iterate over array
 *
 * For example, following snippet of code prints all elements of an integer array numArray.
 *
 * for each loop example
 */
        int[] numArray = {10, 20, 30, 40};

        for(int num : numArray) {
            // Console/Output
            System.out.println(num); //10
            // 20
            // 30
            // 40

        }
/**
 * 3. Java for each loop example – iterate over collection
 *
 * Similarly, for a collection type also, program will be written same.
 */System.out.println();


            List<Integer> numList = new ArrayList<Integer>();

            numList.add(10);
            numList.add(20);
            numList.add(30);
            numList.add(40);

            //foreach loop
            for(int num1 : numList) {

                System.out.println(num1); // 10
                // 20
                // 30
                // 40

            }

        System.out.println();
                     /**

                      4. for each loop with lambda

                      Since Java 8, we can use lambda expressions as well for a collection type.

                      Java program to iterate over a list using for each loop and lambda.
                      */System.out.println();


                List<Integer> numList1 = new ArrayList<Integer>();

                numList1.add(10);
                numList1.add(20);
                numList1.add(30);
                numList1.add(40);

                //foreach loop with lambda
                numList1.forEach( item -> System.out.println(item) );


        System.out.println();
                //Pass function reference
                numList1.forEach( System.out::println );
            }

    }