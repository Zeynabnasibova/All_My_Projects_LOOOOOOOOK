package interviewAll.B24InterviewTask.part10;
import java.util.HashMap;
import java.util.Map;
public class UniqueCharacterFromString {
    /**
     1. Map -- Unique character from String
     Write a method that returns the unique characters from a String using Map.
     */

    public static Map<Character, Integer> unique(String str){
        //   String str = "accabbcd";

        Map<Character, Integer> unique = new HashMap<>();

        for(int i = 0; i < str.length(); i ++) {
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                unique.put(str.charAt(i),count);

            }
        }
        return unique;


    }

    public static void main(String[] args) {

        String str = "zaccabbcde";
        System.out.println(unique(str));

    }

}
