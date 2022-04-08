package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListRemoveAhmed {
    public static void main(String[] args) {
        List<String>list = new ArrayList<> (Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAhmed(list));
    }
    public static List removeAhmed(List <String> list){

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }
        return list;
    }

}
