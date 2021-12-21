package B24InterviewTask.part9;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /**
     * 2. Map -- Frequency of Characters
     * Write a method that prints the frequency of each character from a String
     */



    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);

    }


}