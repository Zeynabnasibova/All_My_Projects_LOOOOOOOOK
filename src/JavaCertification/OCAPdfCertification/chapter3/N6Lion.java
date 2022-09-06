package JavaCertification.OCAPdfCertification.chapter3;

public class N6Lion {
    public void roar(String roar1, StringBuilder roar2) { roar1.concat("!!!");
        roar2.append("!!!");
    }
    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar"); new N6Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2); }}