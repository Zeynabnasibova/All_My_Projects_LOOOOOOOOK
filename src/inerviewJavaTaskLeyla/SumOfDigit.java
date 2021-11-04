package inerviewJavaTaskLeyla;
import  java.util.Scanner;
public class SumOfDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;

     while(number != 0){

         int remainder = number % 10;

         sum += remainder;

         number = number / 10;


     }

        System.out.println(sum);

    }
}
