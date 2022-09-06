package JavaCertification.OCA1Z0_808F.pr;



class Vehicle{

    Vehicle(){
        System.out.println("Vehicle");
    }
}
class Bus extends Vehicle {
    Bus() {
        System.out.println("Bus");
    }

}

public class Transport extends Bus  {
   public Transport(){
       System.out.println("Transport");
    }

    public static void main(String[] args) {

        Transport obj5 = new Transport();//Vehicle
                                        //Bus
                                    //   Transport

        System.out.println();
        Vehicle obj = new Vehicle();//Vehicle

        System.out.println();

      Vehicle obj1 = new Bus();//Vehicle
        // Bus

        System.out.println();

        Bus obj2 = new Bus();//Vehicle
        // Bus

        System.out.println();

        //     Bus obj3 = (Bus) new Vehicle1();Exception in thread "main" java.lang.ClassCastException
    }
}

