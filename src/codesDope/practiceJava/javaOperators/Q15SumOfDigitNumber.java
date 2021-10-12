package codesDope.practiceJava.javaOperators;

public class Q15SumOfDigitNumber {

    public static void main(String[] args) {



        /*
        Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
         */

        int sum = 0;

        int digit = 0;

        int number = 132;

        while(number > 0) {

//finds the last digit of the given number
            digit = number % 10;
//adds last digit to the variable sum
            sum = sum + digit;
//removes the last digit from the number
            number = number / 10;
        }
//prints the result
        System.out.println("Sum of Digits: "+sum);
    }
}
