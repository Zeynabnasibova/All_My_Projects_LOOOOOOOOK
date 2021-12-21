package SaimPdf.CollectionPracticepdf;

public class N4 {
    /**
     * Create a method that will accept a String and return a String with the
     duplicate instances of characters removed
     Ex:
     Input: "AAABBBCCCD"
     Output: ABCD
     */

    public static String nonDuplicate(String str ){

        String nonDuplChar = "";

        for(int i = 0; i < str.length(); i ++){

            if(!nonDuplChar.contains("" + str.charAt(i))){

                nonDuplChar += str.charAt(i);
            }
        }
        return nonDuplChar;

    }
    public static void main (String [] args ){
        String str = "AAABBBCCCD";
        System.out.println(nonDuplicate(str));
    }
}
