package javaTutorial.muhtar.gitJavaFundamentals.Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_Fundamentals {

    public static void main(String[] args) {


		/*
		Map (Interface) implemented by:  HashMap, HashTable, LinkedHashMap, TreeMap(sorts).


		 */

        // Map <Key(immutable), Value(immutable)>:

        Map<String, Integer> obj=new HashMap<>();
        Map<String, Integer> obj2=new LinkedHashMap<>();
        Map<String, Integer> obj3=new Hashtable<>();
        Map<String, Integer> obj4=new TreeMap<>();

        HashMap<String, Integer> obj5=new HashMap<String, Integer>();
        HashMap<String, Integer> obj6=new LinkedHashMap<>();
        // can take one null for Key and multiple nulls for value.
        obj6.put(null, 9);
        obj6.put(null, 10);
        // how many null Keys you have, hashmap will only take one.
        System.out.println(obj6);


        Hashtable<String, Integer> obj7=new Hashtable<>();
        // cannot accept null;
        obj7.put(null, null);
        System.out.println(obj7);

        TreeMap<String, Integer> obj8=new TreeMap<>();
        // sorts Map' Key.


    }

}