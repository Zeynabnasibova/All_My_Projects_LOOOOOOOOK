package refreshjavaCom.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a1 = 10; // value 10 is assigned in variable a
        double d1 = 20.25; // value 20.25 is assigned in variable d
        char c1 = 'A'; // Character A is assigned in variable c
        a1 = 20; // variable a is reassigned with value 20

        int a = 2;
        int b = a;
        int c = a + b;
        int d = sum(a,b);
        boolean e = a>b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int a2 = 10, b2 = 20;
        a2 += 10;  // is same as a = a + 10; // += is a compound assignment
        b2 *= 5;   // is same as b = b * 5; // *= is a compound assignment

    }
    static int sum(int x, int y) {
        return x+y;
    }
}