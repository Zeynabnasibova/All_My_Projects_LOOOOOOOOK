package codingPractice.SaimPdf_.CollectionPracticepdf;

import java.util.ArrayList;
import java.util.Arrays;

public class N1 {

    /**
     * Create a method that will accept an ArrayList of Integers and return
     the ArrayList with only even numbers remaining
     */

    public static ArrayList<Integer> number(ArrayList<Integer> num){

        ArrayList <Integer> newList = new ArrayList<>();

        for(int i = 0; i < num.size();i++){

        if(num.get(i) % 2 == 0) {

            newList.add(num.get(i));

        }
        }
        return newList;
    }

    public static void main(String[] args) {

        ArrayList <Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(number(num));

    }
}
