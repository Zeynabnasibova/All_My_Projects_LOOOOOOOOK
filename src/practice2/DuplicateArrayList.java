package practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArrayList {
  //  Find total number of pairs in ArrayList

    public static String pair(ArrayList<String> list){

        String letter = "";// container
        for(int i = 0; i < list.size(); i++){

            if(!letter.contains(list.get(i))){

                letter += list.get(i);

            }
        }

        String result = "";

        for(int i = 0; i < letter.length(); i++){

            int count = 0;

            for(int j = 0; j < list.size(); j++){

                if(letter.substring(i,i+1).contains(list.get(j))){

                    count++;
                }
            }
            result  += letter.charAt(i) + "" + count;
        }

        return result;
    }

    public static void main(String[] args) {
ArrayList <String> list = new ArrayList<>(Arrays.asList("A","B","B","C","C"));
        System.out.println(pair(list));
    }



}