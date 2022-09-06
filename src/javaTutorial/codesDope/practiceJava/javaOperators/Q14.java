package javaTutorial.codesDope.practiceJava.javaOperators;

public class Q14 {

    public static void main(String[] args) {

/*
        Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
For example, if the number which was taken is 5696, then the displayed number should be 7818.

         */



        int number = 5696;

        int first = number / 1000 + 2;

        number = number % 1000; //696

    //    System.out.println(number);//696

        int second = number / 100 + 2;

        number = number % 100;

      //  System.out.println(number);//96

        int third = (number / 10 + 2) / 10;

      //  System.out.println(number);

        int fourth = number % 10 + 2;

        System.out.println("" + first + second + third + fourth);

    }
}
