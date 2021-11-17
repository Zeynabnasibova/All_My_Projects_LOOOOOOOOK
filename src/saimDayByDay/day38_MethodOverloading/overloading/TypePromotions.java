package saimDayByDay.day38_MethodOverloading.overloading;

public class TypePromotions {

    public static void main(String[] args) {
        use(3);
        use(5.5);
        use(3.5f);

        byte b = 10;
        use(b);
    }

    public static void use(float f){

        System.out.println("using the float method");
    }

    public static void use(double d){

        System.out.println("using the double method");
    }

    public static void use(long l){

        System.out.println("using the long method");
    }

//    public static void use(int nums){
//
//        System.out.println("using the int method");
//    }
//

}
