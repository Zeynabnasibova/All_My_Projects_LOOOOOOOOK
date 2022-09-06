package javaTutorial.johnPurcell_caveofprogramming_com.CollectionsFramework.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String [] args){

        // HashSet does not retain order.
        Set<String> set1 = new HashSet<String>();
        if(set1.isEmpty()){
            System.out.println("set is empty at start");
        }
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");
        System.out.println(set1);

        if (set1.isEmpty()) {
            System.out.println("Set is empty after adding (no!)");
        }


        // LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");
        System.out.println(set2);

        // TreeSet sorts in natural order
        Set<String> set3 = new TreeSet<String>();

        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("snake");
        set3.add("bear");

        // Adding duplication items does nothing
        set1.add("mouse");
        System.out.println(set3);


        //////Iteration//////

        for(String element: set1){
            System.out.println(element);
        }

        ////// Does set contains a given item?///////
        if(set1.contains("aardvark")){
            System.out.println("Contains aardvark");
        }
        if(set1.contains("cat")){
            System.out.println("Contains cat");
        }



        //////Intersection////

        /// set4 contains some common elements with set1, and some new

        Set<String> set4 = new TreeSet<String>();

        set4.add("dog");
        set4.add("cat");
        set4.add("giraffe");
        set4.add("monkey");
        set4.add("ant");

        Set<String> intersection = new HashSet<String>(set1);

        System.out.println(intersection);

        intersection.retainAll(set4);
        System.out.println(intersection);

        //////// Difference /////////

        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set4);
        System.out.println(difference);
    }
}
