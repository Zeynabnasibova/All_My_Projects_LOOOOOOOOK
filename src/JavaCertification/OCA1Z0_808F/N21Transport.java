package JavaCertification.OCA1Z0_808F;

class Vehicle1{

    Vehicle1(){
        System.out.println("Vehicle");
    }
}
class Bus extends Vehicle1 {
    Bus() {
        System.out.println("Bus");
    }

}

public class N21Transport  {

    public static void main(String[] args) {
        Vehicle1 obj = new Vehicle1();//Vehicle

        System.out.println();

        Vehicle1 obj1 = new Bus();//Vehicle
                                // Bus

        System.out.println();

        Bus obj2 = new Bus();//Vehicle
                             // Bus

        System.out.println();

   //    Bus obj3 = (Bus) new Vehicle1();Exception in thread "main" java.lang.ClassCastException
    }
}


