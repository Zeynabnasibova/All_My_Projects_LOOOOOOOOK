package saimDayByDay.day39_WrapperClass;

public class ValueOfExample {

    public static void main(String[] args) {

        String s = "50";
        Integer i = Integer.valueOf(s);//return wrapper class object
        int i2 = Integer.valueOf(s);// unboxing//but value of method gives Integer (wrapper class object)
//parInt() method return primitive data type
        System.out.println(i);
        System.out.println(i2);

    }
}
