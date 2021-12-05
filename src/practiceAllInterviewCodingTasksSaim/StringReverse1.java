package practiceAllInterviewCodingTasksSaim;

public class StringReverse1 {

    /*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */


    public static String reverseWord(String str){

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){

            reverse += str.charAt(i);


        }

        return reverse;
    }

    public static void main(String[] args) {
String str = "ABCDE";
        System.out.println(reverseWord(str));
    }

}
