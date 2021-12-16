package javatpointCom.duplicate;

public class RemoveDuplicateCharactersFromAString {
    /**
     * Java program to remove duplicate characters from a String
     */



    public static String removedDupChar(String str ) {

        String nonduplicate = "";

        for(int i = 0; i < str.length(); i++){
//    if(!nonduplicate.contains(String.valueOf(str.charAt(i)))){
            if(!nonduplicate.contains(""+str.charAt(i))){

                nonduplicate += str.charAt(i) + " ";
            }
        }
        return nonduplicate;
    }

    public static void main(String[] args) {
        String str = "AAABBBCCDEE";
        System.out.println(removedDupChar(str));
    }



}
