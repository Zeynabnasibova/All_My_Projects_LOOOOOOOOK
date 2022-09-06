package codingPractice.replit_.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        // Write your code below

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        list.remove(0);


        // Do not touch below
        System.out.println(list);

    }
}
