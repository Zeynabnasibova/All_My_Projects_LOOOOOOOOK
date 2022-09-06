package codingPractice.codingBatRepeat.Logic2;

public class EvenlySpaced {

    public static void main(String[] args) {


    }


    public boolean evenlySpaced(int a, int b, int c) {
        int max = 0;
        int midle = 0;
        int small = 0;

        if (a > b && a > c && b > c) {
            max = a;
            midle = b;
            small = c;

        }
        if (midle + small == max) {

            return true;


        } else if ((midle + small != max)) {


            return false;
        } else {

            return false;
        }

    }
}