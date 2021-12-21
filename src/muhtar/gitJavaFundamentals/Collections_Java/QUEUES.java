package muhtar.gitJavaFundamentals.Collections_Java;

import java.util.PriorityQueue;
import java.util.Queue;

public class QUEUES {
    public static void main(String[] args) {
        // QUEUE: (FIFO)first in first out. it does take duplicates, it doesn't have index numbers.

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(20);
        q1.add(10);
        q1.add(20);


        System.out.println(q1);

        q1.forEach(System.out::println);


    }

}

		/*
		 	differences between Que and list: index numbers are in list (so we can use get method).
			difference between Que and Set: Que accepts duplicates, but Set does not.
		 */


