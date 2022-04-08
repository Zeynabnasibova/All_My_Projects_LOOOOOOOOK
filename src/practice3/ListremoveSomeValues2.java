package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ListremoveSomeValues2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        System.out.println(removesomeValue(list));
    }
    public static List removesomeValue(List<Integer > list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() > 100){
                it.remove();
            }
        }
        return list;
    }

}
