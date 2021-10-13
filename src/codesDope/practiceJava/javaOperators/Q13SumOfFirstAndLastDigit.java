package codesDope.practiceJava.javaOperators;

public class Q13SumOfFirstAndLastDigit {

    public static void main(String[] args) {


          /*
        Write a program to calculate the sum of the first and the  last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5
         */

        //int num = 12345;


        int firstDig = 0;
        int lastDig = 0;


        int number = 12345;


        lastDig = number % 10;

        while (number > 0) {


            number = number / 10;

           if(number <= 9 && number > 0){

               firstDig = number;
           }


        }

        System.out.println(lastDig);

        System.out.println(firstDig);

        System.out.println("Sum = " + (firstDig + lastDig));

    }

}

