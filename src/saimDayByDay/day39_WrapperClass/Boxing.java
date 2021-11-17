package saimDayByDay.day39_WrapperClass;

public class Boxing {
    public static void main(String[] args) {

        int i = 100;
        Integer i2 = i;

        int i4 = i2;
        System.out.println(i2);

        /*
        i is a primitive type
        we store i into i2 which is wrapper class

        primitive type -> wrapper class object autoboxing
         */
        Integer i3 = 600;//autoboxing

        int z = i3;//unboxing.It goes from wrapper class object to primitive type



    }
}
