package interviewAll.beknazarsuranchiyev;

public class Swap {
    /**
     10.Swap values of two variables without direct reassignment and without creating any extra variables
     */

    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        a = a + b; // 6 + 2 = 8
        b = a - b; // 8 - 2 = 6
        a = a - b; // 8 - 6 = 2

        System.out.println("a after swap = " + a);
        System.out.println("b after swap = " + b);
    }
}
