package replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArr {

    public static ArrayList<String> combineRs(String[] r1, String[] r2){


        ArrayList <String> combine = new ArrayList<String> ();


        ArrayList <String> r1ArrayList  = new ArrayList<String> (Arrays.asList(r1));

        ArrayList <String> r2ArrayList  = new ArrayList<String> (Arrays.asList(r2));

        r1ArrayList.addAll(r2ArrayList);

        combine = r1ArrayList;

        return combine;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }

}
