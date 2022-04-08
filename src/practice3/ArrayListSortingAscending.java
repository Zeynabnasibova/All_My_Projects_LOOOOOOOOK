package practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingAscending {
       /*
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */
       public static void main(String[] args) {
           ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(9, 5, 2, 7));
           System.out.println(sortAscending(list));

       }
       //12345
       public static ArrayList sortAscending(ArrayList <Integer> list){
           Integer temp = 0;
           for(int i = 0; i < list.size(); i++){
         for( int j = i; j < list.size(); j++){
             if(list.get(i) > list.get(j)){
                 temp = list.get(i);
                 list.set(i,list.get(j));
                 list.set(j,temp);
             }
         }
           }
           return list;
       }
}
