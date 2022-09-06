package codingPractice.programmizCom.typeConversion;

public class CharToInt {

    public static void main(String[] args) {

        char ch = 'a';
        int num = ch;
        System.out.println(num);

        char chars = 'a';
        int nums = Integer.parseInt(String.valueOf(ch));
    }
}
