package B24InterviewTask.part5;
import java.util.Scanner;
public class NumberDivisibleBy3515 {

    /*
    3. Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();


            if (number >= 1 && number <= 100 && number % 3 == 0 && number % 5 == 0 && number % 15 == 0) {

                System.out.println("DivisibelBy15");

            }else if (number >= 1 && number <= 100 && number % 3 == 0) {

                System.out.println("DivisibelBy3");

            }else if (number >= 1 && number <= 100 && number % 5 == 0) {

                System.out.println("DivisibelBy5");


            }else{
                System.out.println("not valid number");
            }

        }

    }

