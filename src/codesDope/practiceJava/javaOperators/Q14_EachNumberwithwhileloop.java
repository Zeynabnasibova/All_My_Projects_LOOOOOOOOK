package codesDope.practiceJava.javaOperators;

public class Q14_EachNumberwithwhileloop {
    public static void main(String[] args) {



        int eachnum = 0;

        int number = 5696;

        int y = 1000;


        while(number > 0 && y > 0) {

       eachnum = number / y;//5  5  56 569 1569

            int x = y /10;

            y = x;
            System.out.println(eachnum);
        }


    }
}