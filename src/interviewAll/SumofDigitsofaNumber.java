package interviewAll;

import java.util.Scanner;

public class SumofDigitsofaNumber {

    public static void main(String[] args) {


//http://www.javaforstudents.co.uk/Code_snippets/Sum_of_digits_of_a_number
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");

        int n = in.nextInt();

        if (n <= 0) {

            System.out.println("Integer you've entered is nonpositive.");

        } else {

            int sum = 0;
            // algorithm step by step
            // base:  sum = 0, n = 123
            // step1: n % 10 = 3, n / 10 = 12
            //        sum = 3, n = 12
            // step2: n % 10 = 2, n / 10 = 1
            //        sum = 5, n = 1
            // step3: n % 10 = 1, n / 10 = 0
            //        sum = 6, n = 0
            // stop:  (n != 0) is false

            while (n != 0) {

                // add last digit to the sum
                sum += n % 10;

                // cut last digit
                n /= 10;
            }
            System.out.println("Sum of digits: " + sum);
        }

    }
}
