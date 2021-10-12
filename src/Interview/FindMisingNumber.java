package Interview;

public class FindMisingNumber {
        /*
        A commonly asked puzzle at Java interviews is – find the missing number from a series or array of numbers. This puzzle has been asked in Amazon.com.
         */


        /**
         Solution to find mising number

         Surprisingly, solution of this puzzle is very simple only if you know it already.

         Calculate A = n (n+1)/2 where n is largest number in series 1…N.
         Calculate B = Sum of all numbers in given series
         Missing number = A – B
         Let’s a write the solution in code.


         */

            public static void main(String[] args) {
                //10 is missing
                int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};

                int N = 12;
                int idealSum = (N * (N + 1)) / 2;
                int sum = calculateSum(numbers);

                int missingNumber = idealSum - sum;
                System.out.println(missingNumber);
            }

            private static int calculateSum(int[] numbers) {
                int sum = 0;
                for (int nEach : numbers) {
                    sum += nEach;
                }
                return sum;
            }
        }
