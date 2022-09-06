package interviewAll.B24InterviewTask.part10;

import java.util.*;

public class MinValue {
    /**
     2. Map -- Min value
     - Write a method that can return the minimum value from ta map (DO NOT use sort method)

     */
//A Map is an object that maps keys to values

    public static int minValueMap(Map<String, Integer> map ){

        SortedSet <Integer> sortedMap = new TreeSet<>(map.values());

        int firs = sortedMap.first();
      //  int last = sortedMap.last();

        return  firs;


    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("D",8);
        map.put("C",9);
        map.put("A",7);
        map.put("Y",3);
        System.out.println(minValueMap(map));
    }


}
