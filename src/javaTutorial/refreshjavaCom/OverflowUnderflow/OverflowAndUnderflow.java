package javaTutorial.refreshjavaCom.OverflowUnderflow;

class OverflowAndUnderflow
{
    public static void main(String args[])
    {
        int intOverflow = 2147483647 + 1;
        System.out.println("int overflowed value = "+ intOverflow);

        int intUnderflow = -2147483648 - 1;
        System.out.println("int underflowed value =  "+ intUnderflow);
        // Compilation error in below code, Constant values are checked at compile time for size limit
        // int overflow = 2147483648;  // Crossed maximum prescribed value for int data type
        double doubleOverflow = 1e308 * 10;
        System.out.println("double overflowed value = " + doubleOverflow);

        double doubleUnderflow = 4.9e-324 / 100000;
        System.out.println("double underflowed value = " + doubleUnderflow);
    }
}