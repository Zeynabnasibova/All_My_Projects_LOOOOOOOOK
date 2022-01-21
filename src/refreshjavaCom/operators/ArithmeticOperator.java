package refreshjavaCom.operators;

public class ArithmeticOperator {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int c = a + b; // value of c = 30
        c = b - a; // c = 10
        c = a * b; // c = 200
        c = b / a; // c = 2
        c = 15 % 2; // c = 1

        int a1 = 10, b1 = 20;
        int c1 = 5 + 10; // operands can be a constant value
        c1 = a + b; // operands can be a variable/expression
        c1 = (a - b) + c; // operands can be a variable/expression
        //c2 = a + sum(5,10); // operands can be a function call
        String s1 = "refresh", s2 = "java";
        String s3 = s1 + s2; // s3 = "refreshjava"


        int a2 = 10;
        double b2 = 20.5;
        double d = a + b; // d = 30.5
        d = a * b; // d = 205
        char c2 = 'a' + 5; // c = f

        int a3 = 10;
        double b3 = 20.5;
        double d3 = a + b; // d = 30.5
        d3 = a * b; // d = 205
        char c3 = 'a' + 5; // c = f

        int a4 = 10, b4 = 20;
        a4 += 10; // is same as a = a + 10; // += is addition compound assignment operator
        b4 *= 5; // is same as b = b * 5; // *= is multiplication compound assignment operator

        int num1 = 20, num2 = 10, result;
        result = 5 + 10;
        System.out.println("5 + 10 = " + result);
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        result = num1 + add(2, 3);
        System.out.println("result with method call = " + result);

        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);

        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);

        result = num1 % 7;
        System.out.println(num1 + " % 7 = " + result);

        result += 2; // Equivalent to result = result+2;
        System.out.println("result = " + result);
    }

    static int add(int a, int b) {
        return a + b;

    }
}


