package SaimJavaInterviewCodingTasks;

public class StringSumOfDigitInAString_ {

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }

    public static void main(String[] args) {
        String str = "64hkh";
        System.out.println(sumOfDigits(str));
    }
}
/*
Write a method that can return the sum of the digits in a string
 */