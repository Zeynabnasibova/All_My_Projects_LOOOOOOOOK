package codingBatRepeat.Warmup1;

public class Or35 {

    public static void main(String[] args) {

        Or35 obj = new Or35();
        int n = 7;
        System.out.println(obj.or35(n));


    }

    public boolean or35(int n) {


        if(n % 3 == 0 || n % 5 == 0){

            return true;

        }else{
            return false;
        }


    }

}
