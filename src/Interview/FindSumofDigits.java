package Interview;

import java.util.Scanner;

public class FindSumofDigits {

    public static void main(String args[]) {



        //  number/10 reduces one digit from number
        // and number%10 gives you last digit

        int sum = 0;

        for(int number = 1234; number != 0; number /= 10 ){

           // int lastdigit = input % 10;
            // sum += lastdigit;
            //or
            sum  += number % 10;

        }

        System.out.println(sum);


        //        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter a number to calculate sum of digits");
//
//        int number = sc.nextInt();

//        int input = number;
//
//        while (input != 0) {
//
//            int lastdigit = input % 10;
//
//            sum += lastdigit;
//
//            input /= 10;
//
//        }
 //       System.out.println(sum);


    }

}
