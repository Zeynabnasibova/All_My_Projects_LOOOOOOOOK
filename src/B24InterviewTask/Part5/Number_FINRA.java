package B24InterviewTask.Part5;

import java.util.Scanner;

public class Number_FINRA {

    /*
    1. Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        finra(5);

    }

    public static void finra(int i ) {

        String result = "";

        for ( i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "FIN ";
            } else if (i % 3 == 0) {
                result += "RA ";
            } else {
                result += i + " ";
            }
        }

        System.out.println(result);
    }
}