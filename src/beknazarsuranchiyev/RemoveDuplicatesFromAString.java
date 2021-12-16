package beknazarsuranchiyev;

public class RemoveDuplicatesFromAString {

    /**
    12.Remove duplicates from a string. Write a method that will accept one string argument and return it without duplicates. We will see two versions of this method
     */

    public static String removeDuplicate(String str){

        String removedDuplicate = "";

        for(int i = 0; i < str.length(); i++){
          //  if(!removedDuplicate.contains(String.valueOf(str.charAt(i)))){
            if(!removedDuplicate.contains(""+str.charAt(i))){

                removedDuplicate += str.charAt(i);
            }
        }
        return removedDuplicate;
    }

    public static void main(String[] args) {
String str = "ABCDEFDEFA";
        System.out.println(removeDuplicate(str));
    }

}
