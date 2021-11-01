package SaimJavaInterviewCodingTasks;

public class NumbersPrimeNumber {

    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
/*
Write a method that can check if a number is prime or not
 */