package practice3;

import java.util.ArrayList;

public class LambadaRemoveSomeValues4 {
    public static void main(String[] args) {

    }

    public static ArrayList removeSomeValue(ArrayList<Integer> list){
        list.removeIf(p -> p > 100);
        return list;
    }
}
