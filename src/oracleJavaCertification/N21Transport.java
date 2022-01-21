package oracleJavaCertification;

 class N21Vehicle {

    N21Vehicle(){
        System.out.println("Vehicle");
    }
}
 class Bus extends N21Vehicle{

    Bus(){
        System.out.println("Bus");
    }
}

public class N21Transport {
    public static void main(String[] args) {

        N21Vehicle y = new Bus();
    }

}