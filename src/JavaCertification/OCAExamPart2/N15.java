package JavaCertification.OCAExamPart2;

import java.util.ArrayList;

public class N15 {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(8);

        int a = 4;
        Integer b = 5;
        list.add(a);
        list.add(b);
        System.out.println(list);

        list.remove(a);
        System.out.println(list);
        list.remove(b);
        System.out.println(list);
    }
}
