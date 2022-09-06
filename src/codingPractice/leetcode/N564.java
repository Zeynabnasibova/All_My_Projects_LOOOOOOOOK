package codingPractice.leetcode;

public class N564 {

}


class Solution10 {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        for (long i = 1;; i++) {
        //      for(long i = 0; i < num; i++){

            if (isPalindrome(num - i))
                return "" + (num - i);

            if (isPalindrome(num + i))
                return "" + (num + i);

        }
    }
    boolean isPalindrome(long x) {
        long t = x, rev = 0;
        while (t > 0) {
            rev = 10 * rev + t % 10;
            t /= 10;
        }
        return rev == x;
    }
}
