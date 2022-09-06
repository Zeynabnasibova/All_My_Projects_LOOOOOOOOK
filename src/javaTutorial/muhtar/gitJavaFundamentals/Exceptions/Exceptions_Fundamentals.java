package javaTutorial.muhtar.gitJavaFundamentals.Exceptions;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exceptions_Fundamentals {

    public static void main(String[] args) {
		/*2 Types of Exceptions :
				1. checked exception: will give cimpile error
						1. unrecoverable.


				2. unchecked exception:  will occure only at runtime
						2. recoverable.

		*/

        // unchecked:
        int[] arr= {1,2,3};

        System.out.println( arr[100] );

        //checked exception:

        //	Thread.sleep(2000);

        Set<Integer> st1=new HashSet<>();
        st1.add(10);
        st1.add(20);



        Queue<Integer> q1=new LinkedList<>();
        q1.add(20);
        q1.add(30);

        Iterator<Integer> it=q1.iterator();




    }

}
