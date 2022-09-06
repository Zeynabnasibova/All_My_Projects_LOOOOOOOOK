package javaTutorial.johnPurcell_caveofprogramming_com.CollectionsFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"Five");
        map.put(8,"Eighth");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(2,"Two");

        System.out.println(map);

        map.put(6,"Hello");

        String text  = map.get(6);
        System.out.println(text);

        System.out.println(map);
        for(Map.Entry<Integer, String> entry: map.entrySet()){

            int key = entry.getKey();
            String value  = entry.getValue();

            System.out.println(key + ": " + value);
        }

    }
}
