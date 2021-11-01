package OOP.day1.defaultL;

public class DefaultValues {

    public int intValue;
    public byte byteValue;
    public double doubleValue;
    public boolean booleanValue;
    public char charValue;
    public String stringvalue;
    public Integer integerObject;

    public static void main(String[] args) {

        DefaultValues d = new DefaultValues();//object of class
        // default
        System.out.println(d.intValue);//0
        System.out.println(d.byteValue);//0
        System.out.println(d.doubleValue);//0.0
        System.out.println(d.booleanValue);//false
        System.out.println(d.charValue);
        System.out.println(d.stringvalue);//null
        System.out.println(d.integerObject);//null

        // System.out.println(d.stringvalue.toUpperCase());
        //Exception in thread "main" java.lang.NullPointerException
        //	at murodilOOP.day1.encapsulation.a.DefaultValues.main(DefaultValues.java:25)

        System.out.println(d.intValue + 101);

        d.stringvalue = "Hello World!";
        System.out.println(d.stringvalue.toUpperCase());
    }
}
