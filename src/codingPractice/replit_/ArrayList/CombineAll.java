package codingPractice.replit_.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineAll {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }

public static ArrayList<Integer> combineAL(ArrayList <Integer> numbersOne, ArrayList <Integer> numbersTwo) {


        ArrayList <Integer> newArrayList = new ArrayList <Integer> ();
        numbersOne.addAll(numbersOne.size(),numbersTwo);

        newArrayList = numbersOne;

        return newArrayList;


    }
}
/*

Create a static method that:

is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of numbers called numbersOne, and another ArrayList of numbers called numbersTwo
This method should create a new ArrayList of Integer, add all the numbers (in order) from numbersOne, then add all the numbers (in order) from numbersTwo. In other words, it is combining all the elements from the two lists.
 */