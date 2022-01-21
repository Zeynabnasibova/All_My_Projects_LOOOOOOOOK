package programmizCom.typeConversion;

public class StringToBoolean {
    public static void main(String[] args) {
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);

        String str1 = "false";
        boolean b1 = Boolean.valueOf(str1);
        System.out.println(b1);
    }
}
