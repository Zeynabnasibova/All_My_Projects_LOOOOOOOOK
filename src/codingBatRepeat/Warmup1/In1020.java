package codingBatRepeat.Warmup1;

public class In1020 {

    public static void main(String[] args) {

        In1020 obj = new In1020();

        int a = 3;
        int b = 4;

        System.out.println(obj.in1020(a,b));


    }

    public boolean in1020(int a, int b) {

        if(a >= 10 && a <= 20 || b >= 10 && b <= 20  ){

            return true;

        }else{

            return false;
        }

    }

}
