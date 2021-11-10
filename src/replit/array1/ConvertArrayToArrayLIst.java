package replit.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToArrayLIst {

    public static void main(String[] args) {

        String [] name ={"name", "last name", "year"};

        ArrayList <String> nameList = new ArrayList<String>(Arrays.asList(name));

        System.out.println(nameList);

        int [] nums ={1, 2, 3, 4, 5};

        ArrayList <Integer> numList = new ArrayList<> (Arrays.stream(nums).boxed().collect(Collectors.toList()));

        System.out.println(numList);


      //  String [] name2 ={"name", "last name", "year"};

//Convert String to ArrayList
        String name2 = "Zeynab";

        ArrayList <String> nameList2 = new ArrayList<>();

        //System.out.println(nameList2.addAll(Collections.singleton(name2)));//true

        nameList2.add(name2);
        //System.out.println(nameList2.addAll(Collections.singleton(name2)));//true
        System.out.println(nameList2);

//        System.out.println(nameList2.add(name2));//true

       // System.out.println(nameList2);


    }
}
