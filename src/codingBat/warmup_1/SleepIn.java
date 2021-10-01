package codingBat.warmup_1;

public class SleepIn {
/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
    public static void main(String[] args) {

        System.out.println(sleepIn(true,true));

    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false && vacation == false  || weekday == true && vacation == true){

            return true;

        }else if (weekday == true && vacation == false){

            return false;

        }else if(weekday == false && vacation == true){

            return true;

        }else{
            return true;
        }
    }


}
