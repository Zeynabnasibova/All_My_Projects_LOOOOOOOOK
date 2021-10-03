package codesDope.practiceJava.javaOperators;

public class Q3 {

    public static void main(String[] args) {


        /*
        Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
         */

        int num = (8 + 2345) / 3;// 2353 / 3 = 784

        int finalNum  = num % 5 * 5; //784 % 5 = 4 * 5 = 20

        System.out.println(finalNum);
    }
}
