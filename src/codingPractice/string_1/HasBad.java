package codingPractice.string_1;

public class HasBad {

    /*

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
     */

    public static void main(String[] args) {

        System.out.println(hasBad("badxx"));
    }
    public static boolean hasBad(String str) {


        if(str.length()==0){

            return false;

        }else if(str.startsWith("bad") || str.substring(1).startsWith("bad")){

            return true;

        }else{

            return false;
        }
    }

}
