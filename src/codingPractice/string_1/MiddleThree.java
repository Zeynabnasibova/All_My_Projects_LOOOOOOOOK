package codingPractice.string_1;

public class MiddleThree {
    /**
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
     *
     *
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     */

    public static void main(String[] args) {

        System.out.println(middleThree("Candy"));

    }

    public static String middleThree(String str) {
        //str  = str.substring(str.length()/2-1,str.length()/2+1) + str.substring(str.length()/2+1,str.length()/2+2);

        str  = str.substring(str.length()/2-1,str.length()/2+1) +  str.charAt(str.length()/2 + 1);
        return str;
    }
}
