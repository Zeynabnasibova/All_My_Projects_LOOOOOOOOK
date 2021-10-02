package ArrayInJava;

import java.nio.charset.Charset;

public class JavaByteArrToString {

    public static void main(String[] args) {

        /**

         Java byte[] to String Example
         Last Modified: December 26, 2020

         While working with encryption algorithms, you may get encrypted text as byte[], which later need to be converted to String for comparison purpose. Converting byte[] to String in java is pretty much straightforward and easy. You need to use String class constructor String(byte[] bytes) or String(byte[] bytes, String charsetName) and you will get String represenation of byte array content.

         String str = new String( byteArray );

         //or

         String str = new String( byteArray , charset );
         Convert byte[] to String

         Let’s look at an example for more clarity. I will convert a String to byte array, and then convert back to String – then we will compare both strings and they should match.

         */

        String name = "howtodoinjava.com";

        byte[] byteArray = name.getBytes();

        String str = new String(byteArray);
        String strWithCharset = new String(byteArray, Charset.defaultCharset());

        System.out.println("Original String: "+ name );
        System.out.println("Obtained String: "+ str );
        System.out.println("Obtained String: "+ strWithCharset );

//Output:
//
//Original String: howtodoinjava.com
//Obtained String: howtodoinjava.com
//Obtained String: howtodoinjava.com
    }
}
