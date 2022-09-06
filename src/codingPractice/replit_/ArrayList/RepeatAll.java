package codingPractice.replit_.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {

    public static ArrayList <Boolean> repeatAll(ArrayList <Boolean> bl){

        ArrayList <Boolean> newbl = new ArrayList<>();

        newbl.addAll(bl);
        newbl.addAll(bl);

        System.out.println(newbl);
        return newbl;
    }

    //     ArrayList<Boolean> arrayListClone =  (ArrayList<Boolean>) bl.clone();

    //  //   System.out.println(arrayListClone);
    //     ArrayList<Boolean> newBl = new ArrayList<Boolean>();

    //     arrayListClone.addAll(bl);

    //     return arrayListClone;

    // }

    // Do not touch below

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
