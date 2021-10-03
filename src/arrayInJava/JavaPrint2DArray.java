package arrayInJava;

import java.util.Arrays;

public class JavaPrint2DArray {

    public static void main(String[] args) {

/**
 Java example to print 2d array in string format in console or server logs – using Arrays.deepToString() and custom method.

 1. Arrays.deepToString() to print nested arrays

 Use deepToString() method to get string representation of the “deep contents” of the specified array. If the array contains other arrays as elements, the string representation contains their contents and so on. This method is designed to convert multi-dimensional arrays to strings.

 Print array's deep content
 */


        int [][] cordinates = { {1,2}, {2,4}, {3,6,9} };

        System.out.println( Arrays.deepToString( cordinates ) );    //  [[1, 2], [2, 4], [3, 6, 9]]


/**
 2. Custom method to print 2d array (Not recommended)

 Use given print2DArray() to print 2d arrays in custom format which may not be possible with default deepToString() method. It uses StringBuilder object to build the string representation of array.

 Feel free to customize the method as per your requirements.

 Print 2D Array

 import java.util.Arrays;

 public class TwoDimensionalArrayExamples
 {
 public static void main(String[] args)
 {
 int [][] cordinates = { {1,2}, {2,4}, {3,6,9} };

 System.out.println( print2DArray(cordinates) );
 }

 public static String print2DArray(int arr[][])
 {
 StringBuilder builder = new StringBuilder();
 //Open bracket
 builder.append("[");

 // Loop through all rows and print
 for (int i = 0; i < arr.length; i++) {
 builder.append(Arrays.toString(arr[i]) + ", ");
 }

 //Delete last two characters
 builder.deleteCharAt(builder.length()-1);
 builder.deleteCharAt(builder.length()-1);

 //Close bracket
 builder.append("]");

 return builder.toString();
 }
 }
 Console
 [[1, 2], [2, 4], [3, 6, 9]]
 */





    }
}