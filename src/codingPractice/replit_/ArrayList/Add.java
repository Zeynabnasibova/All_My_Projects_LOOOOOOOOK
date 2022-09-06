package codingPractice.replit_.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Add {


    public static void main(String [] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("app");
        words.add("downtown");
        words.add("raining");

        // Your code here
        System.out.println(words);

        words.add("Zeynab");

        System.out.println(words);

        words.add(0,"hey");

        System.out.println(words);

        words.add(3,"yo");

        // Do not touch below
        System.out.println(words);

        //========================
        ArrayList <String>  list = new ArrayList <>(Arrays.asList("hey", "app", "downtown", "yo", "raining", "Zeynab Nasibova"));

       list.remove("hey");

        System.out.println(list);
//        list.remove(0);

        for(int i = 0; i < list.size(); i += 2){

            //System.out.println(list.get(i));

            if(list.get(i).contains("Zeynab")){

               // list.remove(list.get(i));
                list.remove(0);
             //   System.out.println( list.remove(list.get(i)));
                System.out.println(list);
            }
        }

        //System.out.println(list);

        ArrayList <String>  list1 = new ArrayList <>(Arrays.asList("hey", "app", "downtown", "yo", "raining", "Zeynab Nasibova"));

        System.out.println(list1);

        list.removeAll(Collections.singleton(0));

//        for (int i = 0; i < 1; i ++) {
//
//            list1.remove(0);
//
//            System.out.println(list);
//
//        }

        System.out.println(list);

    }


}
