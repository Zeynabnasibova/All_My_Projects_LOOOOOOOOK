package arrayInJava;

public class ConvertByteArrayToStringAndVice_Versa {


    public static void main(String[] args) {


        /**
        Learn to convert byte[] array to String and convert String to byte[] array in Java with examples. Conversion between byte array and string may be used in many cases including IO operations, generate secure hashes etc.

Until it is absolute necessary, DO NOT convert between string and byte array. They both represent different data; and are there to serve specific purposes i.e. strings are for text, byte[] is for binary data.
         */
/**
1. Java convert byte[] array to String
*/
/*
1.1. String constructor – new String(byte[])

To convert a byte array to String, you can use String class constructor with byte[] as constructor argument.

byte array to string
 */


        byte[] bytes = "hello world".getBytes();

//Convert byte[] to String
        String s = new String(bytes);

        System.out.println(s); // hello world



/**
 *
 * 2. Java convert String to byte[]
 */

/*
2.1. String.getBytes() method

To convert from string to byte array, use String.getBytes() method. Please note that this method uses the platform’s default charset.

byte array to string
 */

//String
        String string = "howtodoinjava.com";

//Convert string to byte[]
        byte[] bytes1 = string.getBytes();

        String str = new String(bytes1);

        System.out.println(str);// howtodoinjava.com

    }
}
