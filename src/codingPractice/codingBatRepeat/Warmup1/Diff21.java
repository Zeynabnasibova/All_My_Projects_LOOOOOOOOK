package codingPractice.codingBatRepeat.Warmup1;

public class Diff21 {
    /*
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
     */
    public static void main(String[] args) {


        Diff21 obj = new Diff21();

        System.out.println(obj.diff21(25));
    }




    public int diff21(int n) {

        if (n > 21) {

            return (n - 21) * 2;

        } else {

            return 21 - n;
        }

    }
}