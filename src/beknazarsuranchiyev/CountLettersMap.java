package beknazarsuranchiyev;

import java.util.HashMap;
import java.util.Map;

public class CountLettersMap {
    /**
     Count letters(Map). Write a method that will accept a string as an argument. The method will count the number of appearances of each char and return map. The key will be a letter and the value will be a number of appearances in the string. See input and output in the example
     */

    public Map<Character, Integer> countLetters(String str) {
        // if order is matter, we can use LinkedHashMap instead
        Map<Character, Integer> letters = new HashMap<>();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
// // if map already contains the key, get the value and put back with +1
            if(letters.containsKey(ch)){

                letters.put(ch, letters.get(ch) + 1);

            }else{
//// if does not contains char as key, new letter put with value 1
                letters.put(ch,1);
            }
        }
        return letters;
    }

    public static void main(String[] args) {

        String str = "hello";

       CountLetters obj = new CountLetters();

        System.out.println();

       // System.out.println(countLetters(str));
    }


}
