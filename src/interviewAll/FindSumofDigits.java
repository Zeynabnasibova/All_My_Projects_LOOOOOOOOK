package interviewAll;
import  java.util.Scanner;
public class FindSumofDigits {

    public static void main(String args[]) {


        //  number/10 reduces one digit from number
//        // and number%10 gives you last digit
//
//        int sum = 0;
//
//        for(int number = 1234; number != 0; number /= 10 ){
//
//           // int lastdigit = input % 10;
//            // sum += lastdigit;
//            //or
//            sum  += number % 10;
//
//        }
//
//        System.out.println(sum);


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number to calculate sum of digits");
        int sum = 0;

        int number = input.nextInt();


        while (number != 0) {

            int remainder = number % 10;

            sum += remainder;

            number = number / 10;

        }
        System.out.println(sum);

    }
}

