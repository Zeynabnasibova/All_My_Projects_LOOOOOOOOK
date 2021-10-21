package codingBatRepeat.Warmup1;

public class SleepIn {
/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */


    public static void main(String[] args) {

        SleepIn obj = new SleepIn();
        obj.sleepIn(false,false);

        System.out.println( obj.sleepIn(false,false));
    }



    public boolean sleepIn(boolean weekday,boolean vacation){

        if(weekday && vacation){
            return true;
        }else if (!weekday || vacation){
            return  true;

        }else {
            return false;
        }


    }
}
