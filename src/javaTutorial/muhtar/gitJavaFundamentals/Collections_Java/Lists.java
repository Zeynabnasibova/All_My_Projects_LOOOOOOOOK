package javaTutorial.muhtar.gitJavaFundamentals.Collections_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // List: it does accept duplicates, it does have index order.

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,5,5,5,5));
        // aslist method converts Array to list
        // 	list1.addAll(1,2,3,4,5,6,7)

        System.out.println( list1 );

        int[] arr= {99,98,232,1,2,3};
        Arrays.sort(arr);

        // in order to sort the list:
        Collections.sort(list1);

        System.out.println(list1);

        // to print each element: get() method
        for(int i=0; i<list1.size();i++)
            System.out.println( list1.get(i) );

        System.out.println("=================");

        // forEach():
        list1.forEach( p -> {if(true) System.out.println(p);} );

        System.out.println("=================");
        list1.forEach(System.out::println);



    }

}