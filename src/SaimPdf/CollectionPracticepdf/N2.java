package SaimPdf.CollectionPracticepdf;

import java.util.ArrayList;
import java.util.Arrays;

public class N2 {

    /**
     Create a method that will accept an ArrayList of Integers and return
     the ArrayList with only odd numbers remaining
     */

    public static ArrayList<Integer> number(ArrayList <Integer> num){

        ArrayList <Integer> newList = new ArrayList<>();

        for(int i = 0; i < num.size(); i++){

            if(num.get(i) % 2 == 1){

                newList.add(num.get(i));
            }

        }
        return newList;

    }

    public static void main(String[] args) {

     ArrayList <Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(number(num));
    }
}
