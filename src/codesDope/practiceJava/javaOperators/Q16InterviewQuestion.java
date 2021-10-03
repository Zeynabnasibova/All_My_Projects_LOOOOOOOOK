package codesDope.practiceJava.javaOperators;

public class Q16InterviewQuestion {

    public static void main(String[] args) {


        /*
        Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
         */


        //int num = 123;

        int reverse = 0;

        for(int num = 123;num != 0; num /= 10){

            reverse = (reverse * 10) + num % 10;


        }

        System.out.println(reverse);

        System.out.println();

        int rev = 0;
        int number = 123;

        while(number != 0){

            int digit = number% 10;

            number /= 10;

            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }
}
