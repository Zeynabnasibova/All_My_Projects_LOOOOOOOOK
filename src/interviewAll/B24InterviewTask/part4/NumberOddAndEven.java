package interviewAll.B24InterviewTask.part4;

import java.util.Scanner;

public class NumberOddAndEven {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num =  input.nextInt();

        System.out.println(OddAndEven(num));
    }


    public static String OddAndEven(int number){

        if(number % 2 == 0){

            return "even";

        }else{

            return "odd";

        }


    }
}
