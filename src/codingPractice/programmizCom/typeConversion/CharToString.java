package codingPractice.programmizCom.typeConversion;

public class CharToString {
    public static void main(String[] args) {

        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println(str);

        char ch1 = 'c';
        String str1 = String.valueOf(ch1);
        System.out.println(str1);



    }
}
