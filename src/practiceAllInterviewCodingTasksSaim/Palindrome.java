package practiceAllInterviewCodingTasksSaim;

public class Palindrome {


    public static boolean sameLetter(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

        }
        if (str.equals(reverse)) {

            return true;

        } else {

            return false;
        }

    }

    public static void main(String[] args) {

        String str = "mom";
        System.out.println(sameLetter(str));
    }
}