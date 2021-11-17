package saimDayByDay.day38_MethodOverloading.overloading;

public class Picture {

    public static void draw(String color){
        System.out.println("Using 1 color");

    }
    public static void draw(String color1,String color2){
        System.out.println("Using two color");

    }
    public static  void draw(int size){
        System.out.println("Drawing " + size + " inches picture");

    }

    public static void main(String[] args) {

        draw(6);
        draw("Red");
        draw("Red","Blue");
    }
}
