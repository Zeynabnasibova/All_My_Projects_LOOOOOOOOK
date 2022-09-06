package interviewAll.B24InterviewTask.part8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingAscending {
    /*
     1. ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.

      */
    // 9876
    //6789
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 8, 9 ,4));

        sortAscending(list);

    }

    public static void sortAscending( ArrayList<Integer> list){

     //   ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 8, 9 ,4));

            Integer temp = 0;
            for(int i = 0;i < list.size();i++){

                for(int j = i; j < list.size(); j++){

                    if(list.get(i) > list.get(j)){

                        temp = list.get(i);

                        list.set(i, list.get(j));

                        list.set(j, temp);

                    }
                }

            }
        System.out.println(list);
    }
}
