package interviewAll;

import java.util.ArrayList;
import java.util.Arrays;

public class FindOnlyDuplicatesInArrayListInteger {


    /**
     * How to print only duplicates in Integer ArrayList?
     */
    public static String duplicateElement(ArrayList<Integer>list){

        //   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        String duplicate = "";

        for(int i = 0; i < list.size(); i++){

            for(int j = i + 1; j < list.size(); j++ ){

                if(list.get(i).equals(list.get(j))){

                    duplicate += list.get(j)+ "\n";

                }
            }
        }
        return "Duplicate elements in given array: \n" + duplicate;
    }

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 7, 8, 8, 3));

        System.out.println(duplicateElement(list));
    }
}
