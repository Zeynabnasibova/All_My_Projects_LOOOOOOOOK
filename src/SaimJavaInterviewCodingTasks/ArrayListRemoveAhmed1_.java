package SaimJavaInterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmed1_ {

    public static void main(String[] args) {


    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

            names.removeAll( Arrays.asList("Ahmed"));



System.out.println(names);
}

}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
