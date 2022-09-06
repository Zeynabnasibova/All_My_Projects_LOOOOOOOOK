package codingPractice.SaimPdf_.customClassPractice.car;

public class Main {

    public static void main(String[] args) {

        Car obj = new Car("Mercedes", "X5");

        System.out.println (obj.brand);

        System.out.println(obj.toString());

        Car obj2 = new Car("Tesla");

        System.out.println(obj2.brand);
        System.out.println(obj2.toString());



    }
}