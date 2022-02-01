package cherchertech.N2;

public class N6 {
    public static void main(String[] args) {

        String a = "hello";

        String b = new String(a);

        String c = a;

        char[] d = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(a == b);//false
        System.out.println(a.equals(b));//true
        System.out.println(a == c);//true
        System.out.println(b == c);//false
        System.out.println(a.equals(d));//false
        System.out.println(b.equals(d));
    }
}
