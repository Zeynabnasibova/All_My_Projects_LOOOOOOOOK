package javaTutorial.arrayList1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContains {

    public static void main(String[] args) {

/**
 1. Java ArrayList Contains Example

 To check if an ArrayList contains an element, use ArrayList.contains(element) method.

 contains(element) method does not take null argument, and will throw NullPointerException is null is passed in the method.
 1.1. Method Syntax

 Method takes one argument of type Object, whose presence in this list is to be tested.
 Method returns true – if list contains the argument element.
 Method returns false – if list DOES NOT contain the argument element.
 Method throws ClassCastException if the type of the specified element is incompatible with this list.
 Method throws NullPointerException if the specified element is null.
 List.contains() method
 boolean contains(Object o);
 1.2. Example to check if ArrayList contains element

 Given example check if “apple” is in the list of fruits. Similar check is done for “lion“, which is not in this list. This example also find the index of element in arraylist.
 */

        /*Check arraylist contains element*/

        ArrayList<String> list = new ArrayList<>( Arrays.asList("banana", "guava", "apple", "cheeku") );

        System.out.println(list.size()-1);
       boolean element1 = list.contains("apple");     //true
        int elm1 = list.indexOf("apple");      //2

        list.contains("lion");      //false
        list.indexOf("lion");       //-1


        System.out.println(element1);
        System.out.println(elm1);

    }
}
