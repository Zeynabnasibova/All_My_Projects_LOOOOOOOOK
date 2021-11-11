package codingBatRepeat.Warmup1;

public class In3050 {

    public static void main(String[] args) {


        In3050 obj = new In3050();
        int a = 9;
        int b = 65;
        System.out.println(obj.in3050(a,b));
    }
    public boolean in3050(int a, int b) {
        if(a >= 30 && a <= 40 && b >= 30 && b <= 40 ||a >= 40 && a <= 50 && b >= 40 && b <= 50 ){
            return true;

        }else{

            return false;
        }

    }



}
