package muhtar.gitJavaFundamentals.Collections_Java;

import java.util.*;

public class Fundamentals {

    public static void main(String[] args) {

/*
 	All collection type are itarable.
 1. Collection(interface) extended by: 1. List (interface), 2. Set(interface), 3. Queue(interface).
 			1. List implemented by : 1. ArrayList, 2.LinkedList, 3. Vector (classes)

 			2. 	a. Set extended by SortedSet(interface) and SortedSet is implemented by Treeset.
 				b. Set implemented by: 1. HashSet , 2. LinkedHashSet (it also extends hashset), 3. TreeSet.

 			3. Queue implemented by: 1. LinkedList, PriorityQue;


 */

        List<Integer> arr=new ArrayList<>();
        List<Integer> arr2=new LinkedList<>();
        List<Integer> arr3=new Vector<>();

        List<Object> listAnything = new ArrayList<Object>();
        List<String> listWords = new ArrayList<String>();
        List<Integer> listNumbers = new ArrayList<Integer>();
        List<String> linkedWords = new LinkedList<String>();

        // WebDriver driver=new ChromeDriver();

        Set<Integer> st1=new HashSet<>();
        Set<Integer> st2=new TreeSet<>();
        Set<Integer> st3=new LinkedHashSet<>();

        SortedSet<Integer> st4=new TreeSet<>();

        HashSet<Integer> st5=new HashSet<>();
        HashSet<Integer> st6=new LinkedHashSet<>();


        Queue<Integer> q6=new PriorityQueue<>();
        Queue<Integer> q7=new LinkedList<>();
        Queue<Integer> q8=new ArrayDeque<>();





    }

}