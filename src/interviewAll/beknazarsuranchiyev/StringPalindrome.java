package interviewAll.beknazarsuranchiyev;

public class StringPalindrome {
   /**
     4.String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward
     */


   public static boolean palindrome(String str){

       String reverse = "";

       for(int i = str.length()-1; i >= 0; i--){

           reverse += str.charAt(i);

       }
       if(reverse.equals(str)){
           return true;

       }else{

           return false;
       }
   }

    public static void main(String[] args) {

       String str = "ana";

        System.out.println(palindrome(str));
    }
}
