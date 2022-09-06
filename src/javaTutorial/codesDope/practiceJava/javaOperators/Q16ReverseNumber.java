package javaTutorial.codesDope.practiceJava.javaOperators;

public class Q16ReverseNumber {

    public static void main(String[] args) {


        /*
        Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
         */


        int reverse = 0;//reverse (stores the reverse number) initialized 0.

        //we want to reverse the number 132
       int number = 132;

       while(number != 0){

           int remainder = number % 10;

           reverse = reverse * 10 + remainder;

           number = number / 10;
       }
        System.out.println(reverse);

    }
}