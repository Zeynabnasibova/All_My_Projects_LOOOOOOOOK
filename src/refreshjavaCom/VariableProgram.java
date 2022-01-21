package refreshjavaCom;

public class VariableProgram {
    public static void main(String [] args) {
        // declaring single variable
        int a = 20;
        // declaring multiple variable
        int b = 30, c = a, d;
        d = a + b;
        System.out.println("d = " +d);
        double pi = 3.14159;
        System.out.println("value of pi = " +pi);
        boolean e = true, f = a>c;
        System.out.println("e = "+e+ "\nf = "+f);
    }
}
/**
 * d = 50
 * value of pi = 3.14159
 * e = true
 * f = false
 */
/**
 int a = 20 // missing semicolon(;) at the end. Correct is ->  int a = 20;
 int b c; // two variables must be separated by comma(,) if declared in same line. Correct is -> int b, c;
 int d = 20.5; // Can't assign float value in int data type
 int p, int q; // Correct is -> int p; int q;  or int p, q;
 int p = int q; // Right side of = operator must be an expression or value, not variable declaration
 int d;
 //System.out.println(d);
 */