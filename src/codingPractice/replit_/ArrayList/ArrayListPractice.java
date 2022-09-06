package codingPractice.replit_.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        java.util.ArrayList<Boolean> bl = new java.util.ArrayList<Boolean>(Arrays.asList(true,true,true));

        java.util.ArrayList<Boolean> newbl = new java.util.ArrayList<>();

        newbl.addAll(bl);
        newbl.addAll(bl);

        System.out.println(newbl);

        List<Boolean> list=new java.util.ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
       Collections.fill(list, Boolean.TRUE);

        System.out.println(list);

        //=====================

        java.util.ArrayList<Boolean> list2 = new java.util.ArrayList<Boolean>(5);
        list2.addAll(Collections.nCopies(5, Boolean.FALSE));
        System.out.println(list2);
    }
}
