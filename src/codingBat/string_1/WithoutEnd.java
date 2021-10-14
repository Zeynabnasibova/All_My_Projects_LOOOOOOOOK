package codingBat.string_1;

public class WithoutEnd {

    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
     */

    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
    }

    public static String withoutEnd(String str) {

    if(str.length() >= 2){

     String newStr = str.substring(1,str.length()-1);

     return newStr;

      }else{

        return str;
    }

    }

}
