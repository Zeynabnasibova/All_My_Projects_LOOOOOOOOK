package replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAllClone {


    public static ArrayList repeatAll(ArrayList <Boolean> bl){

        ArrayList<Boolean> arrayListClone =  (ArrayList<Boolean>) bl.clone();

     //   System.out.println(arrayListClone);
        ArrayList<Boolean> newBl = new ArrayList<Boolean>();

        arrayListClone.addAll(bl);

        return arrayListClone;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

}

/*
Create a static method that:

is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is

(true, false, false)

The modified ArrayList should be

(true, false, false, true, false, false)
 */