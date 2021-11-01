package SaimJavaInterviewCodingTasks;
import  java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MapSortTheMapByValue {


    public static Map<String, Integer>  sortByValue(Map<String, Integer> map){

        List<Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Entry.comparingByValue());

        map = new LinkedHashMap();

        for(Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;

    }

}
/*
Write a method that can sort the Map by values
 */