package interviewAll;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class RemoveDuplicatesFromArrayListInteger {

    /**
     * How to remove duplicates from Integer ArrayList ?
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(asList(1, 8, 3, 8, 2, 1, 8, 8, 3, 1));

        String nonduplicate = "";

        for(int i = 0; i < list.size(); i++){

            if(!nonduplicate.contains(""+ list.get(i))){

                nonduplicate += list.get(i) + " ";
            }
        }
        System.out.println(nonduplicate);
    }


}
