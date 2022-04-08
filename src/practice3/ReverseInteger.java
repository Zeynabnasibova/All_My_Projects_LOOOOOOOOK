package practice3;

/** * Java Program to reverse Integer in Java, number can be negative. * Example 1: x = 123, return 321 * Example 2: x = -123, return -321 * * @author Javin Paul */
public class ReverseInteger {
    public static void main(String args[]) {
        int input = -5678;
        int output = reverseInteger(-5678);
        System.out.println("Input : " + input + " Output : " + output);
    }
    /* * Java method to reverse an integer value. there are couple of * corner cases * which this method doesn't handle e.g. integer overflow. */

    public static int reverseInteger(int number) {
        boolean isNegative = number < 0 ? true : false;
        if (isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
             reverse = reverse * 10 + lastDigit;
             number = number / 10; // get rid of last digit
             }
        return isNegative == true? reverse*-1 : reverse;
    }
}
