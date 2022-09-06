package codingPractice.string_1;

public class SeeColor {
    /**
     * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
     *
     *
     * seeColor("redxx") → "red"
     * seeColor("xxred") → ""
     * seeColor("blueTimes") → "blue"
     */

    public static void main(String[] args) {

        System.out.println(seeColor("redxx"));
    }

    public static String seeColor(String str) {

        if(str.startsWith("red") && str.length() >= 3){
            str = str.substring(0,3);
            return str;
        }else if(str.startsWith("blue") && str.length() >= 4){
            str = str.substring(0,4);
            return str;
        }else{
            return "";
        }
    }
}
