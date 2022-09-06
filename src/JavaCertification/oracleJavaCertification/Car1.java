package JavaCertification.oracleJavaCertification;

 class N18Vehicle {

    String type = "4W";
    int maxSpeed = 100;
    N18Vehicle(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    N18Vehicle(){}
}
public class Car1 extends N18Vehicle {
    String trans;

    Car1(String trans){
        this.trans = trans;
    }
    Car1(String type, int maxSpeed,String trans){
        super(type, maxSpeed);
        this.trans = trans;
    }

    public static void main(String[] args) {

        Car1 c1 = new Car1("Auto");
        Car1 c2 = new Car1("4w", 150, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type+ " " + c2.maxSpeed + " "  + c2.trans);
    }
}