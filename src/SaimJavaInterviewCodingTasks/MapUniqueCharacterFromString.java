package SaimJavaInterviewCodingTasks;

import java.util.HashMap;
import java.util.Map;

public class MapUniqueCharacterFromString {


    public static void main(String[] args) {

        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }

}
