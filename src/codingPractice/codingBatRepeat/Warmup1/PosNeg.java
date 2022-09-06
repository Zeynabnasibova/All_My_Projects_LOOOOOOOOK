package codingPractice.codingBatRepeat.Warmup1;

public class PosNeg {

    public static void main(String[] args) {

        PosNeg obj = new PosNeg();

        int a = 6;
        int b = 9;
        boolean negative = true;
        System.out.println(obj.posNeg(a,b,negative));
    }

    public boolean posNeg(int a, int b, boolean negative) {

        if(( a < 0  && b > 0 || b < 0 && a > 0 ) && !negative ){

            return true;

        }else if(a < 0 && b < 0  && negative){

            return true;
        }else{
            return false;
        }


    }

}
