package Interview;

public class PalindromeNumber {

    public static void main(String[] args)
    {
        System.out.println(checkIntegerPalindrome( 100 ));        //false
        System.out.println(checkIntegerPalindrome( 101 ));        //true
        System.out.println(checkIntegerPalindrome( 500045 ));     //false
        System.out.println(checkIntegerPalindrome( 50005 ));  //true
    }

    /**
     * This function will test the equality if a number and its reverse.
     * @return true if number is palindrome else false
     * */
    public static boolean checkIntegerPalindrome(int number) {

        
        boolean isPalindrome = false;

        if(number == reverse(number)) {

            isPalindrome = true;
        }
        return isPalindrome;
    }

    /**
     * This function will reverse a given number.
     * @return reverse number
     * */
    public static int reverse(int number) {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        } while (number > 0);
        return reverse;
    }
}
