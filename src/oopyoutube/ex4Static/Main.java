package oopyoutube.ex4Static;

public class Main {
    public static void main(String[] args) {

        Hotel preston1 = new Hotel(20);
        Hotel preston2 = new Hotel(30);

        System.out.println(preston1.a);
        preston1.a = 9;
        System.out.println(preston1.a);
        System.out.println(preston2.a);
    }


}
