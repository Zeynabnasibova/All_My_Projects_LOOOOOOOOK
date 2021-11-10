package codingBatRepeat.Array1;

public class CommondEnd {


    public static void main(String[] args) {

        CommondEnd obj = new CommondEnd();

        int[] a = {1, 2, 3};
        int[] b = {1, 5, 6};

        System.out.println(obj.commondEnd(a, b));


    }

    public boolean commondEnd(int[] a, int[] b) {

        if (a.length >= 1 && a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;

        } else {

            return false;
        }

    }
}