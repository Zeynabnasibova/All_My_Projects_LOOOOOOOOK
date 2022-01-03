package januaryPractice.interviewTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveSomeValues1 {

       /*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
public static ArrayList<Integer> removedSomeValues(ArrayList<Integer> list){

    ArrayList<Integer>listRemoved = new ArrayList<>();

    for(int i = 0 ; i < list.size();i++) {
        if (list.get(i) < 100){
            listRemoved.add(list.get(i));
        }
    }
    list = listRemoved;
    return list;
}

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,101,5,607));
        System.out.println(removedSomeValues(list));
    }
}
