package practiceAllInterviewCodingTasksSaim;

public class StringRemoveDuplicates1 {
     /*
    Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static String removeDuplicate(String str) {

        String nonDuplicate = "";

        for (int i = 0; i < str.length(); i++) {

            if(!nonDuplicate.contains(""+str.charAt(i))){

                nonDuplicate += str.charAt(i);
            }

        }
        return nonDuplicate;
    }

    public static void main(String[] args) {
String str = "AAABBBCCC";
        System.out.println(removeDuplicate(str));
    }
}
