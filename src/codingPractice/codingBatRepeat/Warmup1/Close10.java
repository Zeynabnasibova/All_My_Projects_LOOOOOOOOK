package codingPractice.codingBatRepeat.Warmup1;

public class Close10 {


    public static void main(String[] args) {

        Close10 obj = new Close10();

        int a = 8;
        int b = 10;
        System.out.println(obj.close10(a, b));


    }


    public int close10(int a, int b) {

        if (Math.abs(a - 10) > Math.abs(b - 10)) {

            return b;


        } else if (Math.abs(b - 10) > Math.abs(a - 10)) {

            return a;


        } else {

            return 0;
        }

    }
}