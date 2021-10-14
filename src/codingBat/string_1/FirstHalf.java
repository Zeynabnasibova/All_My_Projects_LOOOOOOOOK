package codingBat.string_1;

public class FirstHalf {
    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     *
     *
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"s
     */

    public static void main(String[] args) {

        System.out.println(firstHalf("HelloThree"));
    }

    public static String firstHalf(String str) {
        str = str.substring(0,str.length()/2);
        return str;
    }
}

