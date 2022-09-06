package interviewAll.beknazarsuranchiyev;

public class StringReverse {
    /**
     1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
     */

    public String reverse(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i-- ){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main (String [] args){
        String str = "Movlud";
        StringReverse obj = new StringReverse();
        System.out.println(obj.reverse(str));
    }


}
