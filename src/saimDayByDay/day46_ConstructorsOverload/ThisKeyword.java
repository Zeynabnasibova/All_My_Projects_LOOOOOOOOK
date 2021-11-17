package saimDayByDay.day46_ConstructorsOverload;

public class ThisKeyword {
    int a = 100; // instance variable

    public ThisKeyword(int a){ // a is the local variable
        System.out.println(a);
        a = 400; // reassign the local a to be 400
    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(70);
        System.out.println(obj.a);
        //System.out.println(a);

    }


}