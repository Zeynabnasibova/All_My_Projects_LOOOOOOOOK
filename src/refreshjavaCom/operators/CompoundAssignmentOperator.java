package refreshjavaCom.operators;

class CompoundAssignmentOperator {
    public static void main (String[] args) {
        int a = 10;
        a += 10;
        int b = 100;
        b -= 20;
        int c = 3;
        c *= 10;
        short s = 200;
        s &= 100;
        short s2 = 100;
        s2 ^= 10;
        byte b2 = 127;
        b2 >>= 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
        System.out.println("b2 = " + b2);
    }
}