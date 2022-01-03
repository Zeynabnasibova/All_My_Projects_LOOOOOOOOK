package muhtar.gitJavaFundamentals.Maps;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMaps {

    public static void main(String[] args) {
        HashMap< String, Integer> map1=new HashMap<>();
        map1.put("zzz",9);
        map1.put("zzz", 10);
        map1.put("zzz", 11);
        System.out.println(map1);
        // key cannot be duplicate so will take the latest updated key

        System.out.println( map1.get("zzz2") );

        HashMap<String, LocalDate> map2=new HashMap<>();
        map2.put("Irpan", LocalDate.of(1998, 2, 19));
        map2.put("Yashar", LocalDate.of(1993, 10, 14));
        map2.put("Shehla", LocalDate.of(1993, 1, 1));
        map2.put(null, null);
        System.out.println(map2);
        System.out.println( map2.get("Yashar"));


        TreeMap<String, LocalDate> map3=new TreeMap<>();
        map3.put("Irpan", LocalDate.of(1998, 2, 19));
        map3.put("Yashar", LocalDate.of(1993, 10, 14));
        map3.put("Shehla", LocalDate.of(1993, 1, 1));
        System.out.println(map3);

        Hashtable<String, Integer> map4=new Hashtable<>();
        //  map4.put(null, null);    hashtable does not accept null.
        System.out.println(map4);





    }

}