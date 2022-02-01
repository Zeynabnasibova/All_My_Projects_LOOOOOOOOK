package cherchertech.N2;

public class N4 {

    private static int a;
    private int b;
    public void fct() {
        int c;
        c = a; // (1)
        a++; // (2)
        b += c; // (3)
        a -= b; // (4)
        System.out.println(a);
    }
    public static void main(String[] args) {

        N4 obj = new N4();
        obj.fct();
    }
}