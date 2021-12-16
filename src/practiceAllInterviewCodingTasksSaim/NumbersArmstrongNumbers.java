package practiceAllInterviewCodingTasksSaim;

public class NumbersArmstrongNumbers {

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

        int num = 153;
        int firstNumber = (num / 100) % 10;
        int second = (num / 10) % 10; // 123 / 10 = 12
        int thirdNumber = num % 10; //3

        System.out.println(firstNumber);
        System.out.println(second);

        System.out.println(thirdNumber);

        int sumOfCubs = firstNumber * firstNumber * firstNumber + second * second * second + thirdNumber * thirdNumber * thirdNumber;
        System.out.println(sumOfCubs);
        if (sumOfCubs == num) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }


}
