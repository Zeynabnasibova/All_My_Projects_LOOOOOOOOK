package canvasShortVideo.ConstractorEx1.wrapperClassesShortVideo;

public class primitiveWrapperClasses {

    /**
     boolean - Boolean   ->   Boolean b = new Boolean(true);
                              Boolean b = new Boolean("true");

     char - Character    ->   Character c = new Character('c');

     byte - Byte         ->   Byte bt1 = new Byte(byte) 123);
                              Byte bt2 = new Byte("123");

     short - Short     ->    Short s1 = new Short(short) 1200);
                             Short s2 = new Short("1200");

     int - Integer     ->  Integer i1 = new Integer(1202);
                           Integer i2 = new Integer("1202");

     long - Long      ->  Long l1 = new Long(2435647640);
                          Long l2 = new Long("224546578);

     float - Float   ->   Float f1 = new Float(12.2f);
                          Float f2 = new Float("12.2f);

     double - Double  ->  Double d1 = new Double(2.8768899);
                          Double d1 = new Double("2.6969600);



     Primitive Type --> Wrapper Reference Type
                   Boxing

     Wrapper Reference Type  -->  Primitive Type
                        UnBoxing


     Integer i1 = 12; -->  Auto-Boxing
     int i1 = new Integer("12"); --> Auto-Unboxing

     int i1 = new Integer("12");
     Integer i2 = i1;

     Integer i1 = new Integer(12);
     Integer i2 = 12; // int 12 is auto boxed to Integer i2
     int i3 = i2; // Integer i1 is auto-unboxed to int 12

     Double d1 = 3.14; //double 3.14 is auto-boxed d1
     double d2 = new Double(12.5); // Double 12.5 is auto-unboxed to double
     double d3 = d1; // d1 with reference type Double auto-unboxed to double



 Wrapper class    Converting String to primitive       Converting String to wrapper class
                         X.pareX(str)                               X.valueOf(str)

 Boolean    -->   Boolean.parseBoolean("true");        Boolean.valueOf("true");

 Character  -->    None                                   No

Byte    -->      Byte.parseBoolean("1");              Byte.valueOf("1");

Short    -->     Short.parseBoolean("1");             Short.valueOf("1");

Integer    -->    Integer.parseBoolean("1");          Integer.valueOf("1");

Long     -->     Long.parseBoolean("1");             Long.valueOf("1");

Float    -->     Float.parseBoolean("1");             Float.valueOf("1");



     Long.MIN_VALUE;

     Integer.compare(x,y);

     doubleVar.isNaN();

     Character.isDigit(ch);












     */
}
