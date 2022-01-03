package januaryPractice.interviewTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmed1 {

    public static ArrayList<String> removedAhmed(ArrayList<String> list){

        if(list.contains("Ahmed")){
            list.removeAll(Arrays.asList("Ahmed"));
        }
        return list;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Ahmed","Zeynab","Ahmed"));

        System.out.println(removedAhmed(list));
    }
}
