package SaimJavaInterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class LambadaRemoveSomeValues4 {

    public static void main(String[] args) {



    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list.removeIf(p -> p>100);

        System.out.println(list);
}


}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */