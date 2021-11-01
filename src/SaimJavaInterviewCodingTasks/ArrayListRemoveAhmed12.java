package SaimJavaInterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListRemoveAhmed12 {

    public static void main(String[] args) {



    List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

for(
    ListIterator<String> it=names.listIterator(); it.hasNext();)

            if(it.next().equals("Ahmed"))

            it.remove();



System.out.println(names);

    }
}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */