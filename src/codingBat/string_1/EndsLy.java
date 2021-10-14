package codingBat.string_1;

public class EndsLy {
    /**
     *
     Given a string, return true if it ends in "ly".


     endsLy("oddly") → true
     endsLy("y") → false
     endsLy("oddy") → false
     */

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }

    public static boolean endsLy(String str) {
        //return str.endsWith("ly");

        if(str.endsWith("ly") ){

            return true;
        } else {

            return false;

        }
    }
}
