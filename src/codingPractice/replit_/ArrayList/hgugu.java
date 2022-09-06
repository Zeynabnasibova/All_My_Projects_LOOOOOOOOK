package codingPractice.replit_.ArrayList;

import java.util.ArrayList;

public class hgugu {

    public static void main(String[] args) {


     ArrayList<String> test = new ArrayList<String>();


            test.add("a");
            test.add("b");
            test.add("c");
            test.add("d");
            test.add("e");

        System.out.println(test);

            ArrayList<String> toRemove = new ArrayList<String>();
            int count = 2;

            for (int i = 0; i < test.size(); i++) {
                if (i % count == 0) {
                    toRemove.add(test.get(i));
                }
            }

            test.removeAll(toRemove);

            System.out.print(test);
        }
    }
