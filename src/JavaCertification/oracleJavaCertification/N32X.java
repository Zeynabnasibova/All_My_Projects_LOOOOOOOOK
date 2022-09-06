package JavaCertification.oracleJavaCertification;

public class N32X {

    int i;
    static int j;
    public static void main(String[] args) {

        N32X x1  = new N32X();
        N32X x2 = new N32X();

        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;

        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);

    }

}
