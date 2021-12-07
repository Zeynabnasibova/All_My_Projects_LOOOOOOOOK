package practiceAllInterviewCodingTasksSaim;

public class NumbersDivideWithoutDivOperator {

    /*
Write a method that can divide two numbers without using division operator
 */

    public static void divide(int num1, int num2) {

        if (num2 == 0) {

            System.out.println("Invalid Number");

        }else{

            int result = 0;

            while (num1 >= num2) {

                num1 = num1 - num2;// 6 - 3 = 3,  3 - 3 = 0

                result++;


            }
            System.out.println(result + " and remainder = " + num1);
        }


    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        divide(num1,num2);

    }
}