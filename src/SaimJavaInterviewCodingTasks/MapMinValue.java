package SaimJavaInterviewCodingTasks;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapMinValue {

    public  static  int  minValue( Map<String,Integer>    map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }
}
/*
Write a method that can return the minimum value from ta map (DO NOT use sort method)
 */