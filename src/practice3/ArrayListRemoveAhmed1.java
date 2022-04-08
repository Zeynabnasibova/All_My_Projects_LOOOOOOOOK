package practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmed1 {
        /*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
        public static void main(String[] args) {
            ArrayList <String> list = new ArrayList <> (Arrays.asList("Ahmed", "John"," Eric", "Ahmed"));
            System.out.println(removeAhmed(list));
        }
        public static ArrayList removeAhmed(ArrayList <String> list){
            list.removeAll(Arrays.asList("Ahmed"));
            return list;
        }

}
