package interviewAll.beknazarsuranchiyev;

public class NumberPalindrome {

    /**
     5.Number palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward. The straight forward solution would be to convert number to string and use the above approach. Some interviewers will not allow to do it. So let’s take a look at what we can do here.
     */

    public static boolean palindrome(int num){

        int coppyOfOriginal = num;

        int reverse = 0;

        while(num != 0){

            int remainder = num % 10;

            reverse = reverse * 10 + remainder;

            num = num / 10;
        }
        if(coppyOfOriginal == reverse){

            return true;

        }else{

            return false;
        }
    }

    public static void main(String[] args) {

        int num = 101;
        System.out.println(palindrome(num));
    }
}
