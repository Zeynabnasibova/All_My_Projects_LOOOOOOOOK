package CertificationWhithSeanKennedy;

public class OverridingPolymorphism  extends Car{
    public int gearRatio = 9;
    public String accelerate(){
        return " Accelerate : SportsCar";
    }

    public static void main(String[] args) {
        Car c = new OverridingPolymorphism();
        System.out.println(c.gearRatio + c.accelerate());

        OverridingPolymorphism obj = new OverridingPolymorphism();
        System.out.println("obj.gearRatio = " + obj.gearRatio);
    }

}
class Car{
   public int gearRatio = 8;
   public String accelerate(){
       return " Accelerate : Car";
   }
}
