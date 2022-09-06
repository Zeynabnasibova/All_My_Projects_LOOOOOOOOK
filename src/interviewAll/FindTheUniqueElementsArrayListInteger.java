package interviewAll;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheUniqueElementsArrayListInteger {
    /**
     Find unique elements in ArrayList Java
     */
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7,1));

        String unique = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                unique += list.get(i) + " ";
            }
        }
        System.out.println(unique);
    }

}