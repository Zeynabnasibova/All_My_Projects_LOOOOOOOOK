package arrayInJava;

import java.util.Arrays;

public class tryr {

    public static void main(String[] args) {


        String blogName = "how to do in java";

        blogName.split(" ");

        System.out.println(Arrays.toString(blogName.split(" ")));


        String blogName1 = "how to do in java";
        String[] words = null;

// Method 1 :: using String.split() method
        words = blogName1.split(" ");

        System.out.println(Arrays.toString(words));



    }
}
