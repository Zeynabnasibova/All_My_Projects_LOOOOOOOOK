package refreshjavaCom.operators;

public class UnaryOperators {


    public static void main(String[] args) {

        int a = +10, b = -20;  // operand can be a constant value
        int c = -a; // operand can be a variable
        int d = -(a+b); // operand can be an expression
     //   int e = -sum(a,b); // operand can be a method(sum) call
        System.out.println();

        boolean b1 = !true;  // operand can be a boolean value // b = false
        boolean c1 = !b1; // operand can be a boolean variable // c = true
        boolean d1 = !(10 > 5); // operand can be an expression // d = false
      //  boolean e1 = !isValid(); // operand can be a boolean method(isValid) call
    //    boolean f = !10; // Incorrect, operand can't be a constant value
        System.out.println(b1);
        System.out.println(c1);

        int result = +5;
        System.out.println("result = "+result);
        result--;
        System.out.println("result = "+result);
        result++;
        System.out.println("result = "+result);
        result = -result;
        System.out.println("result = "+result);
        int i = 5;
        i++;
        System.out.println("i = "+i); // prints 6
        ++i;
        System.out.println("i = "+i); // prints 7
        System.out.println("i = "+ ++i);  // prints 8
        System.out.println("i = "+ i++);  // prints 8
        System.out.println("i = "+i); // prints 9
        System.out.println("i = "+ --i); // prints 8
        boolean isValid = false;
        System.out.println("isValid = "+ !isValid);
    }
    }