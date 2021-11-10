package codingBatRepeat.Warmup1;

public class HasTeen {


    public static void main(String[] args) {

        HasTeen obj = new HasTeen();

        int a = 13;
        int b = 20;
        int c = 10;

        System.out.println(obj.hasTeen(a,b,c));


    }



    public boolean hasTeen(int a, int b, int c) {

        if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19){

            return true;

        }  else {

            return false;


        }
    }

}

