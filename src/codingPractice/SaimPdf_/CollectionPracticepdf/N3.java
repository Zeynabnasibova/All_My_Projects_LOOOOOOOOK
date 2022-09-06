package codingPractice.SaimPdf_.CollectionPracticepdf;

import java.util.ArrayList;
import java.util.Arrays;

public class N3 {
    /**
     * Create a method that will accept an ArrayList and sort the ArrayList
     into ascending order (s -> l).
     - Do not sure any ready sort method. Try to implement your own
     sorting
     -> How will you do the opposite direction (l -> s)?
     */


    public static ArrayList<Integer> ascending (ArrayList <Integer> num){

        Integer temp = 0;

        for(int i = 0; i < num.size(); i++){

            for(int j = i + 1; j < num.size(); j++){

                if(num.get(i) > num.get(j)){

                    temp = num.get(i);

                    num.set(i,num.get(j));

                    num.set(j,temp);

                }

            }
        }
return num;

    }

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(3,4,6,8,9,3));

        System.out.println(ascending(num));

        System.out.println(descending(num));
    }

    public static ArrayList <Integer> descending(ArrayList<Integer> list){

        Integer temp = 0;

        for(int i = 0; i < list.size(); i ++){

            for(int j = i + 1; j < list.size();j++){

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
