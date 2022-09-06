package JavaCertification.OCA1Z0_808F;

public class N13 {
    public static void main(String[] args) {

        Vehicle y = new Car(20);
        System.out.println(y);

    }

}
class Vehicle {
    int x;
    Vehicle(){
        this(10);
    }
    Vehicle(int x){
        this.x = x;
    }
}

class Car extends Vehicle{
     int y;
     Car(){
         super(10);
     }
     Car(int y){
         super(y);
         this.y = y;
     }
     public String toString(){

         return super.x + ":" + this.y;
     }
}