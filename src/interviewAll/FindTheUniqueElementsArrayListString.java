package interviewAll;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheUniqueElementsArrayListString {
    /**
     Find unique elements in ArrayList Java
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","A","A","B","B","B","C","C","C","D","E","F"));

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