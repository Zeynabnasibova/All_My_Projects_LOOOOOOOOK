package replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    public static String search(ArrayList <String> r, String find){

        for(int i = 0; i < r.size(); i++) {

            if (r.get(i).contains(find)) {

                return r.get(i);


            }

        }
        return "search failed";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}
/*
The search method accepts ArrayList of Strings and String find. The method returns a String.

It will look for an element within ArrayList that contains value of find

if it finds it, methods needs to return whole Element value.
if an instance of find doesn't exist return:"search failed"
Example:

search(["one apple","two orange","four banana"],"four")

returns:
"four banana"

("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")

returns:
"search failed"

(no "goodbye" in any element)

hint: use contains string method to test if element has word value in it.
 */