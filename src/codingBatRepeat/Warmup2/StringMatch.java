package codingBatRepeat.Warmup2;

public class StringMatch {

    /*

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
     */

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }


    public static int stringMatch(String a, String b) {

        String c = "";

        int count = 0;

        for (int i = 0; i + 1 < a.length() - 1; i++) {

            if ((b.indexOf(c + a.charAt(i) + a.charAt(i + 1), i) == i)) {
                count++;
            }
        }
        return count;
    }
}