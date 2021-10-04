package arrayInJava;

import java.util.Arrays;
import java.util.regex.Pattern;

public class JavaStringToStringArray {

    public static void main(String[] args) {


/*
Java example to convert string into string array using String.split() method and using java.util.regex.Pattern class.
 */


        //1. String to String[]

        String blogName = "how to do in java";
        String[] words = null;

// Method 1 :: using String.split() method
        words = blogName.split(" ");                //[how, to, do, in, java]

// Method 2 :: using Pattern.split() method
        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(blogName);            //[how, to, do, in, java]

//2. String[] to String

        String newName = String.join(" ", words);   //"how to do in java"



        /**
         1) Convert String to String[]

         1.1) String.split()

         Use split() method to split string into tokens by passing a delimiter (or regex) as method argument.

         String split() method example

         */

        String names = "alex,brian,charles,david";
        String[] namesArray = null;

        //Split string with comma
        namesArray = names.split(",");

        //Verify array content
        System.out.println(Arrays.toString(namesArray));// [alex, brian, charles, david]

/**
 1.2) Pattern.split()

 In Java, Pattern is the compiled representation of a regular expression. Use Pattern.split() method to convert string to string array, and using pattern as delimiter.

 String split() method example

 */System.out.println();


        String names1 = "alex,brian,charles,david";
        String[] namesArray1 = null;

        //Split string with comma
        Pattern pattern1 = Pattern.compile(",");
        namesArray1 = pattern1.split( names1 );

        //Verify array content
        System.out.println(Arrays.toString(namesArray1)); //[alex, brian, charles, david]
/**
 2) String[] to String

 Use String.join() method to create string from String array. You need to pass two method arguments i.e.

 delimiter – the delimiter that separates each element
 array elements – the elements to join together
 It will then return a new string that is composed of the ‘array elements’ separated by the ‘delimiter’.

 String join() method example

 */


        String[] tokens = {"How","To","Do","In","Java"};

        String blogName1 = String.join("", tokens);     //without space

        String blogName2 = String.join(" ", tokens);    //with one space

        String blogName3 = String.join("-", tokens);    //with hyphen

        //Verify string
        System.out.println(blogName1);
        System.out.println(blogName2);
        System.out.println(blogName3);
    }
}
 /*
Output:

        HowToDoInJava
        How To Do In Java
        How-To-Do-In-Java
*/
