package inerviewJavaTaskLeyla;

public class Factorial {

// 3 factoril 3 * 2 * 1 = 6

    public static void main(String[] args) {
        int number = 3;
        //      i = 3
        long factorial = 1;
        // 1 * 3 = 3  3 * 2 = 6 6 * 1= 6
        for(int i = number; i > 0; i--){

            factorial = factorial * i;


        }
        System.out.println(factorial);
    }


}
