package practiceAllInterviewCodingTasksSaim;

public class NumbersOddAndEven {

    /*
Write  a method which can identifies given number is even or odd

EX:

identify(5) ->  "Odd"

identify(6) ->  "Even"
 */

    public static String evenOrOdd(int num ){
        if(num % 2 == 0){

        return "even";
        }else{

            return "odd";
        }

    }

    public static void main(String[] args) {

        int num = 4;

        System.out.println(evenOrOdd(num));
    }
}
