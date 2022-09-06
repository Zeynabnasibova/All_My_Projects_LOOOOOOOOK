package JavaCertification.OCAIZO_808;

public class N5Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    N5Vehicle(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    N5Vehicle(){

    }

}
class Car extends N5Vehicle{
    String trans;
    Car(String trans){
        this.trans = trans;
    }
    Car(String type, int maxspeed,String trans){
        super(type,maxspeed);
        this.trans = trans;
    }
    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W",150,"Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}
