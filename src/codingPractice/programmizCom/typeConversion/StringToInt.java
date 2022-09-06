package codingPractice.programmizCom.typeConversion;

public class StringToInt {
    public static void main(String[] args) {

        String str = "76";
        int num = Integer.parseInt(str);
        System.out.println(num);

        String str1 = "87";
        int num1 = Integer.valueOf(str1);
        System.out.println(num1);
    }
}
