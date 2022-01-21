package refreshjavaCom.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int result = a > b ? 5 : 1; // Expression can be a constant value
        int result2 = a > b ? a : b; // Expression can be a variable
        int result3 = a > b ? (a-b) : (b-a);
        String str = (a == b) ? "Equal" : "Not Equal";
    }
}
