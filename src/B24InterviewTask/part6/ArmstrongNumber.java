package B24InterviewTask.part6;

public class ArmstrongNumber {

    /*
    3. Numbers -- Armstrong numbers
- Write a method that can check if a number is Armstrong number

     */

    /**
     * An Armstrong number of three digit is a number whose sum of cubes of its digit is equal
     * For example 153 is an Armstrong number
     * of 3 digit because 1^3+5^3+3^3 or   1+125+27=153
     */

    public static void main(String[] args) {


        System.out.println(isArmStrong(153));
    }

    private static boolean isArmStrong(int number) {

        int result = 0;

       int orig = number;

       while(number != 0){

           int remainder = number % 10;

           result = result + remainder * remainder * remainder;

           number = number/10;


       }

        //number is Armstrong return true
        if(orig == result){

            return true;

        }

        return false;

    }

}
