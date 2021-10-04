package arrayInJava;

import java.util.Arrays;

public class JavaArrayContains {

    public static void main(String[] args) {

        /**
         * To check if an element is in an array, Use Arrays class to convert array to arraylist and apply same contains() method
         */

        String[] fruits = new String[] { "banana", "guava", "apple", "cheeku" };

        Arrays.asList(fruits).contains("apple"); // true
        Arrays.asList(fruits).indexOf("apple"); // 2

        Arrays.asList(fruits).contains("lion"); // false
        Arrays.asList(fruits).indexOf("lion"); // -1


        System.out.println(Arrays.asList(fruits).contains("apple"));
        System.out.println(Arrays.asList(fruits).indexOf("apple"));

        System.out.println(Arrays.asList(fruits).contains("lion"));
        System.out.println(Arrays.asList(fruits).indexOf("lion"));
    }
}
