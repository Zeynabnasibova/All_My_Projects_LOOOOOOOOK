package codingBat.string_1;

public class ExtraEnd {
    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
     */


    public static void main(String[] args) {

        System.out.println(extraEnd("hello"));
    }



    public static String extraEnd(String str) {

        if(str.length()>=2){

            String newSTr = str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2) ;

            return  newSTr;
        }else{
            return str;
        }


    }
}
