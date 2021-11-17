package codingBatRepeat.Logic2;

import codingBatRepeat.Warmup1.LoneTeen;

public class LoneSum {


    public static void main(String[] args) {


        LoneSum obj = new LoneSum();

        int a = 9;
        int b = 9;
        int c = 6;

        System.out.println(obj.loneSum(a,b,c));

    }

    public int loneSum(int a, int b, int c) {

        if (a != b && a != c && b != c) {

            return a + b + c;

        } else if (a == c && a != b) {

            return b;

        } else if (a == b && a != c) {

            return c;

        } else if (b == c && b != a) {

            return a;

        } else {

            return 0;
        }
    }
}
