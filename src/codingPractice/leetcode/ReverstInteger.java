package codingPractice.leetcode;

public class ReverstInteger {

    public static void main(String[] args) {


        System.out.println(reverseInt(12345));
    }

    public static int reverseInt(int x) {


        int reverse = 0;

        for (; x != 0; x /= 10) {

            reverse = (reverse * 10) + x % 10;

        }
return reverse;
    }
}
