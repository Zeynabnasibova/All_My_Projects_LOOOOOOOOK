package javatpointCom.duplicate;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class  RemoveDuplicatesFromArrayListString {

    /**
     * How to remove duplicates from String ArrayList ?
     */



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(asList("A", "A", "B", "B", "A", "B"));

        String nonduplicate = "";

        for(int i = 0; i <list.size(); i++){

            if(!nonduplicate.contains(""+ list.get(i))){

                nonduplicate += list.get(i) + " ";
            }
        }
        System.out.println(nonduplicate);
    }

}
