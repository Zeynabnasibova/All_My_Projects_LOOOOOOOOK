package replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeAndGet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

//     ArrayList <String> someList = new ArrayList<>(Arrays.asList("Zeynab","Anar"));
//     ArrayList <String> arr = new ArrayList<String>(Arrays.asList("Mahir-Qorqud","ZehraNur","Movlud"));
//
//     String getWord = someList.get(1);
//    int sizeSomeList = someList.size();
//        System.out.println(sizeSomeList);



       // ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        int sum = 0;
        for(int i = 0; i < list.size(); i++){

            sum += list.get(i);

        }
        System.out.println(sum);
    }
}
/*
The next two methods are .size() and .get().

If we have an ArrayList called someList and an Array called arr, these two do the same thing:

someList.size()

arr.length

In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at index i. The following two expressions also do the same thing:

someList.get(4)

arr[4]

Task: Given an ArrayList of Integers called list, find and print the sum of all the numbers in the list
 */
/**
 ArrayList <String> list = new ArrayList<String>();
 list.add("Zeynab");
 list.add("Movlud");
 System.out.println(list);

 ArrayList <Integer> numbers = new ArrayList<>(6);
 System.out.println(numbers);
 System.out.println(  numbers.add(1));
 numbers.add(1);
 numbers.add(2);
 System.out.println(numbers);
 System.out.println(  numbers.add(1));

 ArrayList <String> alfab = new ArrayList<String>(Arrays.asList("W", "A","B", "C"));
 System.out.println(alfab);

 String getf = alfab.get(1);
 System.out.println(getf);

 */