package B24InterviewTask.part7;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove_Ahmed {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<String>(Arrays.asList("Anar","Zeynab","Mahir","Zehra","Movlud","Ahmed"));

        list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);

    }
}
/*
2. ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed

 */