package cherchertech.N1;

import java.util.ArrayList;
import java.util.List;

public class N9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

//        if(list.remove(2)) {
//            list.remove("THREE");
//        }

        System.out.println(list);
    }
}
class N10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Roob");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        names.add("John");

        if(names.remove("Bran")){
            names.remove("John");
        }
        System.out.println(names);
    }
}