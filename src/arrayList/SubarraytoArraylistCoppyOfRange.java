package arrayList;

import java.util.Arrays;
import java.util.List;

public class SubarraytoArraylistCoppyOfRange {

    public static void main(String[] args) {





/**
 2. Subarray to Arraylist

 Java example to create arraylist from subarray. It is done in two steps:

 Create subarray from array with desired items.
 Convert array to list.
 */
        String[] names = {"Alex", "Brian", "Charles", "David"};

//Array to sublist
        List<String> namesList = Arrays.asList( Arrays.copyOfRange(names, 0, 2) );


        System.out.println(namesList);
    }
}
