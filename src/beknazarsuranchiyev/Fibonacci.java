package beknazarsuranchiyev;

public class Fibonacci {

    /**
     The Fibonacci. It is a series of numbers where the next number is the sum of the previous two numbers. The first two numbers of the Fibonacci is 0 followed by 1. Write a method that will accept one int number n. The method will print n number of Fibonacci numbers.
     */


    public static void fibonacci(int num){

        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1+" "+num2);//printing 0 and 1

        for(int i = 2; i < num; i++){//loop starts from 2 because 0 and 1 are already printed

            num3 = num1 + num2;

            System.out.print(" " + num3);

            num1 = num2;
            num2 = num3;
        }


    }

    public static void main(String[] args) {

        int num = 10;
  fibonacci(num);
    }
}
