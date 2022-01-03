package practiceAllInterviewCodingTasksSaim;

public class NumberReverseNegativeNumber {
    /*
Write a return method that can reverse negative number and return it as int
 */

    public static int reverseInteger(int num){

        int reverse = 0;

        while(num != 0){

            int remainder = num % 10;

            reverse = reverse * 10 + remainder;

            num = num / 10;

        }

        return reverse;

    }
    public static void main(String [] args){
        int num = -123;
        System.out.println(reverseInteger(num));

    }
}
