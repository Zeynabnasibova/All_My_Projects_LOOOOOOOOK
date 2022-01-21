package programmizCom.DecisionMakingAndLoop;

public class CheckLeapYear {

    public static void main(String[] args) {
        /*
         * This method uses standard logic to check leap year in Java.
         * A year is a leap year if its multiple of 400 or multiple of 4 but not 100
         */

        int year =2012;
        if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ){

            //true || true && false
            //false || true && true
            //false || false && false
            System.out.println("Leap year");
        }else{
            System.out.println("not Leap year");
        }
    }
}
/**

 Output:
 Is 2000 a leap year ? : true
 Is 2012 a leap year ? : true
 Is 1901 a leap year ? : false
 Is 1900 a leap year ? : false
 Does 2000 a leap year : true
 Does 2012 a leap year : true
 Does 1901 a leap year : false
 Does 1900 a leap year : false


 */