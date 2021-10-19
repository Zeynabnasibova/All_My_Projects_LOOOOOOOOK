package codingBat.string_1;

public class ConCat {

    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
     */
    public static void main(String[] args) {

        System.out.println(conCat("abc","cat"));
    }

    public static String conCat(String a, String b) {

        if (a.length() == 0) {

            return b;

        } else if (b.length() == 0) {

            return a;

        } else if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {

            String snewStr = a.substring(0) + b.substring(1);


            return snewStr;
        } else{

            return a + b;
        }
    }
}