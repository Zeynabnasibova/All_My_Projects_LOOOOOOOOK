package SaimJavaInterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListremoveSomeValues3_ {

    public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

    Iterator<Integer> it = list.iterator();

        while(it.hasNext())

                if(it.next()>100)

                it.remove();



        System.out.println(list);
}

}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */