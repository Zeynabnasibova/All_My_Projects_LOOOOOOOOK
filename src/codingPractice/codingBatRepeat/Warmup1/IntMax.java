package codingPractice.codingBatRepeat.Warmup1;

public class IntMax {


    public static void main(String[] args) {

        IntMax obj = new IntMax();

        int a = 3;
        int b = 8;
        int c = 2;
        System.out.println(obj.intMax(a, b, c));


    }


    public int intMax(int a, int b, int c) {

        if(a>b && a>c){
            return a;
        }else if (b>a && b > c){
            return b;
        }else{
            return c;
        }


    }
}
