package B24InterviewTask.part7;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove_Some_Values {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList <> (Arrays.asList(1, 2, 3, 4, 5, 6, 105, 106, 109,110, 120));

        ArrayList <Integer> listNew = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) < 100){

                listNew.add(list.get(i));

            }
        }
       // System.out.println(listNew);
        list = listNew;
        System.out.println(list);

    }
}
/*
3. ArrayList -- Remove some values
- Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

 */