package B24InterviewTask.part6;

public class ArmstrongNumber {

    public static void main(String[] args) {

    /*
    3. Numbers -- Armstrong numbers
- Write a method that can check if a number is Armstrong number

     */

        /**
         * An Armstrong number of three digit is a number whose sum of cubes of its digit is equal
         * For example 153 is an Armstrong number
         * of 3 digit because 1^3+5^3+3^3 or   1+125+27=153
         */

        int number = 153;

            int result = 0;//27   125  153

            int orig = number;

            while (number != 0) {//153  // 15  //1

                int remainder = number % 10;
                //153 % 10 = 3
                //15 % 10 = 5
                //1 % 10 = 1

                result = result + remainder * remainder * remainder;
                //       0 + 3 * 3 * 3 = 27
                //       27 + 5 * 5 * 5 = 27 + 125  = 152
                //      152 + 1 * 1 * 1 = 153

                number = number / 10;
                //153 / 10 = 15
                // 15 / 10 = 1
                // 1 /10 = 0


            }

            //number is Armstrong return true
            if (orig == result) {

                System.out.println(true);

            } else {

                System.out.println(false);

            }

        }
    }
