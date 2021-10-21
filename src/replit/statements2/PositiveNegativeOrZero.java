package replit.statements2;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    /*
    Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this

Examples:

num  = 1

positive

num = -6

negative

num = 0

zero
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(num > 0){
            System.out.println("positive");
        }else if(num < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }

}
