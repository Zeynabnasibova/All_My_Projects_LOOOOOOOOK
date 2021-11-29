package practiceAllInterviewCodingTasksSaim;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveSomeValues1 {

    /*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 102, 103, 104, 105));

        ArrayList<Integer> listNew = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < 100) {

                listNew.add(list.get(i));

            }
        }
        list = listNew;

        System.out.println(list);
    }

    }
