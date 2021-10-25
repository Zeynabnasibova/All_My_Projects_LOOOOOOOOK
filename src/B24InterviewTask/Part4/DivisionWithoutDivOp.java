package B24InterviewTask.Part4;

import java.util.Scanner;

public class DivisionWithoutDivOp {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int numFirst = input.nextInt();
        System.out.println("Enter your second number");
        int numSecond = input.nextInt();
        System.out.println(division(numFirst,numSecond));

    }

    public static int division (int num1, int num2){

        int result = 0;

        while (num1 >= num2){

            num1 = num1 - num2;

            result++;

        }
        return result;
    }
}
