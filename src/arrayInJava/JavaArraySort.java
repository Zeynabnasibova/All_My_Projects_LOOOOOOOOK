package arrayInJava;

import java.util.Arrays;
import java.util.Collections;

public class JavaArraySort {

    public static <Employee> void main(String[] args) {

        /**
         Java example to sort an array of primitives and objects which implement Comparable interface.

         Quick Reference:
         //Sort array of primitives
         String[] tokens = {"A","C","B","E","D"};

         Arrays.sort(tokens);                                //Sorted array in natural order

         Arrays.sort(tokens, Collections.reverseOrder());    //Sorted array in reverse order

         //Sort array of objects
         Employee[] employees = getEmployees();

         Arrays.sort(employees);                             //Sorted array of objects

         */

/**
 1) Sort array of primitives or strings

 Use Arrays.sort() method to sort an array of primitives such as int, long or String values.


 Sort array of strings
 */

        String[] tokens = {"A","C","B","E","D"};

        System.out.println(Arrays.toString(tokens));    //[A, C, B, E, D

        Arrays.sort(tokens);

//Verify sorted array elements
        System.out.println(Arrays.toString(tokens));    //[A, B, C, D, E]
        System.out.println();
        Arrays.sort(tokens, Collections.reverseOrder());
        System.out.println(Arrays.toString(tokens));
        /**
         1.1) Sort array in reverse order

         Use Arrays.sort(arr,Collections.reverseOrder()) to sort an array in reverse oder.

         Reverse sort array of strings
         */System.out.println();

        String[] tokens1 = {"A","C","B","E","D"};

        System.out.println(Arrays.toString(tokens1));    //[A, C, B, E, D]

        Arrays.sort(tokens1, Collections.reverseOrder());

//Verify reverse sorted array elements
        System.out.println(Arrays.toString(tokens1));    //[E, D, C, B, A]


        /**
         2) Sort array of objects

         Use Arrays.sort() method to sort an array of objects. The objects must implement the Comparable interface which will decide their sorting order.

         All elements in the array must implement the Comparable interface.
         All elements in the array must be mutually comparable and must not throw a ClassCastException while comparing.
         Equal elements (based on comparing logic) will not be reordered as a result of the sort; and will appear as their order in array.
         Uses stable, adaptive, iterative merge sort which gives better performance.
         In given example, we are sorting an array of Employee objects which is in some random order. We will sort the array based on employee 'id' field.

         Sort array of employees

         import java.util.Arrays;
         import java.util.Random;

         public class Main
         {
         public static void main(String[] args)
         {
         Employee[] employees = getEmployees();

         System.out.println(Arrays.toString(employees)); //Unsorted array

         Arrays.sort(employees);

         System.out.println(Arrays.toString(employees)); //Sorted array
         }

         //Some method which return array of employees in random order
         private static Employee[] getEmployees()
         {
         Random rand = new Random(10);
         Employee[] arr = new Employee[5];
         for(int i = 0; i < 5; i++) {
         Employee e = new Employee();
         e.setId(rand.nextInt(100));
         arr[i] = e;
         }
         return arr;
         }
         }


         Watch the console.

         Console
         [Employee [id=13], Employee [id=80], Employee [id=93], Employee [id=90], Employee [id=46]]  //Unsorted
         [Employee [id=13], Employee [id=46], Employee [id=80], Employee [id=90], Employee [id=93]]  //Sorted by employee id
         */


    }
    }

