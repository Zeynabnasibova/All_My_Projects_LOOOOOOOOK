package SaimJavaInterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemoveAhmed13 {
    public static void main(String[] args) {



    List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

            List<String> names2 = new ArrayList<>();

    names.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );



System.out.println(names2);


}

}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */