package javaTutorial.refreshjavaCom.operators;

public class IncrementDecriment {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4, d = 5;
        int p = a++; // p = 2; first assignment happens then the increment
        p = a; // a = 3, p = 3; // a was increased in previous line
        int q = ++b; // q = 4; first increment happens then the assignment
        int r = c--; // r = 4, first assignment happens then the decrement
        r = c; // c = 3, r = 3; // c was decreased in previous line
        int s = --d; // s = 4; first decrement happens then the assignment
        System.out.println(r);

        System.out.println(b);
    }
}
