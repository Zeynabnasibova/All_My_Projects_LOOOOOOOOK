package javaTutorial.codesDope.practiceJava.javaOperators;

public class Q13SumOfFirstAndLastSecondNum {

    public static void main(String[] args) {

 /*
        Write a program to calculate the sum of the first and the  second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5
         */


        int firstNumber = 0;
        int lastSecpondNumber = 0;
        int lastNumber = 0;

        int number = 5696;
        for(int i = 0; i < number; i++);

        firstNumber = number / 1000;// 5
        lastSecpondNumber = (number % 100 - number % 10) /10;// 96 - 6 = 90 / 10 = 9

        lastNumber = number % 10; // 6

        System.out.println(firstNumber);
        System.out.println(lastSecpondNumber);
        System.out.println(lastNumber);

        System.out.println("sum =" + (firstNumber + lastSecpondNumber));


    }
}
