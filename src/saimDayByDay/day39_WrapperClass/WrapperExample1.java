package saimDayByDay.day39_WrapperClass;

public class WrapperExample1 {
    public static void main(String[] args) {

        int a = 5;

       // Integer i1 = new Integer();
        Integer i2 = new Integer(a);//make wrapper class object
        Integer i3 = new Integer(5);
        Integer i4 =  100;//this convert int primitive to Integer wrapper class

        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        byte b = 10;
        Byte b1 = new Byte(b);
        Byte b2 = new Byte((byte)5);
        Byte b3 = (byte)500;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        short s = 100;
        Short s2 = new Short((short)200);
        Short s3 = 300;

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        long l = 1000l;
        Long l2 = new Long(2000);
        Long l3 = 3000l;

        Float f1 = new Float(4.5F);
        Float f2 = 4.7f;




    }
}
