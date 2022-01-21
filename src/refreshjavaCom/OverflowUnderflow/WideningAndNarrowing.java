package refreshjavaCom.OverflowUnderflow;
class WideningAndNarrowing
{
    public static void main(String [] args)
    {
        byte b=20;
        int i=b;    //byte to int widening
        long l=b;   //byte to long widening
        double d=b; //byte to double widening
        System.out.println("int value after widening : "+ i);
        System.out.println("long value after widening : "+ l);
        System.out.println("double value after widening : "+ d);

        double d2 =20.5;
        byte b2 = (byte)d2;   //Narrowing double to byte
        // long ll=d2;  //compile time error, must be explicitly casted
        long l2= (long)d2;    //Narrowing double to long
        float f2= (float)d2;  //Narrowing double to float
        System.out.println("Narrowing double value to byte : "+ b2);
        System.out.println("Narrowing double value to long : "+ l2);
        System.out.println("Narrowing double value to float : "+ f2);
    }
}