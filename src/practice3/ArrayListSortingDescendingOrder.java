package practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingDescendingOrder {

    /*
Write a method that can sort the ArrayList in descending order without using the sort method
 */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 8, 9 ,4));
        System.out.println(sprtDescending(list));
    }
    //987654
    public static ArrayList sprtDescending(ArrayList <Integer> list) {
        Integer temp = 0;
        for (int i = 0; i < list.size();i ++){
            for(int j = i ; j < list.size();j++){
                if(list.get(i) < list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;

    }
}
