package codingPractice.programmizCom.typeConversion;

public class BooleanToString {
    public static void main(String[] args) {

        boolean b = true;
        String str = String.valueOf(b);
        System.out.println(str);

        boolean bol = false;
        String str1 = Boolean.toString(bol);
        System.out.println(str1);
    }
}
