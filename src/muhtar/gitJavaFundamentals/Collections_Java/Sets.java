package muhtar.gitJavaFundamentals.Collections_Java;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Set: does not take duplicates and does not have index orders.
        // SortedSet: does not take duplicates and does not have index order, and sorts the elements


        Set<Integer> st1=new HashSet<>();
        st1.add(10);
        st1.add(10);
        st1.add(10);
        st1.addAll(Arrays.asList(20,30,40,50));

        System.out.println( st1 );
        // System.out.println( st1.get(0) );  set does not have index order.

        // to print: need iterator
        Iterator<Integer> it = st1.iterator();  // now it has order,
        while( it.hasNext() ) {
            if(it.next() <=30) {
                it.remove();
            }
        }
        System.out.println(st1);

        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(90);
        ss.add(10);
        ss.add(9);
        ss.add(5);
        System.out.println(ss);


        List<Integer> list1=new ArrayList<>(Arrays.asList(100,30,20,10,5,100,5,10));
        TreeSet<Integer> TS=new TreeSet<>();
        TS.addAll(list1);

        System.out.println(TS);



        String AA="AAABBBCCCDDD";	// ==> ABCD

        String[] strarr=AA.split("");
        HashSet<String> hs=new HashSet<>(Arrays.asList(strarr));
        String nonDup = hs.toString().replace("[", "").replace(", ", "").replace("]", "");
        System.out.println(nonDup);




    }

}