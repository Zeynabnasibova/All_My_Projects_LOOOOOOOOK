package codingBatRepeat.Warmup1;

public class LastDigit {

    public static void main(String[] args) {

        LastDigit obj = new LastDigit();

        int a = 8;
        int b = 9;

        System.out.println(obj.lastDigit(a,b));

    }

    public boolean lastDigit(int a, int b) {

        if(a % 10 == b % 10){

            return true;

        }else{
            return false;
        }

    }

}
