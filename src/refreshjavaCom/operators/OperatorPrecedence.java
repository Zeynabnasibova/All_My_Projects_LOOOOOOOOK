package refreshjavaCom.operators;

class OperatorPrecedence {
    public static void main (String[] args) {
        int result = 0;
        result = 5 + 2 * 3 - 1;
        System.out.println("5 + 2 * 3 - 1 = " +result);

        result = 5 + 4 / 2 + 6;
        System.out.println("5 + 4 / 2 + 6 = " +result);

        result = 3 + 6 / 2 * 3 - 1 + 2;
        System.out.println("3 + 6 / 2 * 3 - 1 + 2 = " +result);

        result = 6 / 2 * 3 * 2 / 3;
        System.out.println("6 / 2 * 3 * 2 / 3 = " +result);

        int x = 2;
        result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;
        System.out.println("result = " +result);
    }
}