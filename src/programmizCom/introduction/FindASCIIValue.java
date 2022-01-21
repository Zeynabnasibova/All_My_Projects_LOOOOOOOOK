package programmizCom.introduction;

public class FindASCIIValue {
    public static void main(String[] args) {

        char ch = 'a';

        int ascii = ch;
        //or
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
