package interviewAll.B24InterviewTask.part9;

import java.util.*;

public class SortMapByValues {
    /**
     * 1. Map -- Sort the map by values
     * Write a method that can sort the Map by values
     */
//A Map is an object that maps keys to values
    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }


        return map;
    }




    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("D",8);
        map.put("C",9);
        map.put("A",7);
        map.put("Y",3);
        System.out.println(sortByValue(map));
    }


}