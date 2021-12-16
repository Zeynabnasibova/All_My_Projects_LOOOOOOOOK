package beknazarsuranchiyev;

import java.util.Arrays;

public class TwoStringAnagram {
    /**
     . Two string anagram. An anagram is when all the letters in one string exist in another but the order of letters does not matter. Write a method that will accept two string arguments and will return true if they are anagram and false if they are not.
     */

    public static boolean anagram (String str1, String str2 ) {

        String [] str1Arr = str1.split("");
        String [] str2Arr = str2.split("");

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

    //    if(str1Arr.equals(str2Arr)){
      if(Arrays.equals(str1Arr,str2Arr)){

          return true;

      }else{

          return false;
      }
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silnet";
        System.out.println(anagram(str1,str2));
    }
}
