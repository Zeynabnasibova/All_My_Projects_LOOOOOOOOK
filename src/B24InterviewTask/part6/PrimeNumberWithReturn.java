package B24InterviewTask.part6;

import java.util.Scanner;

public class PrimeNumberWithReturn {


    /*
    2. Numbers -- Prime Number
Write a method that can check if a number is prime or not

     */

    /**
     * A prime number is a whole number greater than 1, which is only divisible by 1 and itself. First few prime numbers are : 2 3 5 7 11 13 17 19 23
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = input.nextInt();

        //prime number have two factors
        // 3 / 1   first factor
        // 3 / 3     second factor

        System.out.println(isPrime(num));

    }

    public static boolean isPrime(int num) {

        if (num == 0 || num == 1) {

          return false;

        } else {

            int count = 0;

            for (int i = 2; i <= num; i++) {

                if (num % i == 0) {

                    count++;
                }

            }
            if (count == 1) {


              return true;

            } else {

            return false;
            }
        }
    }

}
