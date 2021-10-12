package Interview;

public class PalindromeString {

    /*
    Java palindrome string example

To check palindrome string, reverse the String characters. Now use String.equals() method to verify if given string was palindrome or not.
     */

    public static void main(String[] args) {

        System.out.println( isPalindromeString("howtodoinjava") );
        System.out.println( isPalindromeString("abcba") );
    }

    public static boolean isPalindromeString(String originalString) {


        String reverse = "";

        int length = originalString.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + originalString.charAt(i);

        return originalString.equals(reverse);
    }
}
