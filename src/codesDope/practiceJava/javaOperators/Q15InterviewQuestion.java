package codesDope.practiceJava.javaOperators;

public class Q15InterviewQuestion {

    public static void main(String[] args) {



        /*
        Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
         */

        int sum = 0;

        for(int num = 132; num != 0;num /= 10){

            sum = sum + num % 10;

        }
        System.out.println(sum);


    }
}
