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

        System.out.println(finra(number));

    }

    public static String finra(int number) {

        int fin = 3;
        int ra = 5;

    if(number * 3 <= 30 && number * 5 <= 30){

        return "FINRA";

    }else if(number * 3 <= 30){

             return "FIN";

        }else if(number * 5 <= 30 ) {

            return "RA";

        }else{

             return "Non are multiple";
        }


    }
}
