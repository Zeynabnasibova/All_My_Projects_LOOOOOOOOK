package inerviewJavaTaskLeyla;
import java.util.Scanner;
public class PolindromeInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = 0;

        int temp = number;

        while (number != 0){

            int remainder = number % 10;

            reverse = reverse * 10 + remainder;

            number = number / 10;
        }
        System.out.println(reverse);

        if(reverse == temp){

            System.out.println("palindrome");

        }else{

            System.out.println("not palindrome");
        }
    }

}
