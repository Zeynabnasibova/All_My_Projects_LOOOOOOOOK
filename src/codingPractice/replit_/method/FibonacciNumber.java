package codingPractice.replit_.method;

public class FibonacciNumber {

    public static void main(String[] args) {
        // Set it to the number of elements you want in the Fibonacci Series
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 0; i < maxNumber; i++) {

            System.out.print(previousNumber+" ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
    }
}
/*
Complete a method fib() that will compute Fibonacci numbers

In the Fibonacci series, the next number is the sum of previous two numbers. For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc... The first two numbers of the Fibonacci series are 0 and 1. (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

You are given a number num, print n-th Fibonacci Number.

Examples:

Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1, 1 --> 1)

Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)
 */