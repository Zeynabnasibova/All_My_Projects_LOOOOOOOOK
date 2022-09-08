package practiceAllInterviewCodingTasksSaim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListRemoveAhmed {
    public static void main(String[] args) {



        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {

            if(it.next().equals("Ahmed")) {

                it.remove();
            }

        }

        System.out.println( names );
    }

}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */