package codingPractice.codingBatRepeat.Warmup1;

public class MonkeyTrouble {

    public static void main(String[] args) {

        MonkeyTrouble obj = new MonkeyTrouble();
        boolean aSmile = true;
        boolean bSmile = true;
        System.out.println(obj.monkeyTrouble(aSmile,bSmile));


    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }else {
            return false;
        }


    }



}
