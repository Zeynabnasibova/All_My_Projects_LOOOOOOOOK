package codingPractice.replit_.method;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int temp = num;
        int reverse = 0;
        while(num != 0){

            int remainder = num % 10;

            reverse = reverse * 10 + remainder;

            num = num / 10;


        }

        if(temp == reverse){

            System.out.println(true);

        }else{
            System.out.println(false);
        }


    }
}

/*
Complete the method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).

Challenge: Do not convert int into a string!
Examples:

input: 1001

output: true

input: 1234

output: false
 */
