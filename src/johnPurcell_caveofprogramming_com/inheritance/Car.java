package johnPurcell_caveofprogramming_com.inheritance;

public class Car extends Machine{ //car is inheritance from Machine.
                                   // Car is child class of Machine.
                                   //Machine is a parent class.
                                   //Car has got all method what have Machine class
                                  //Car inheritance all the method of Machine
    public void wipeWindShield(){
        System.out.println("Wiping windshield");
    }

    public void start() { // this method was overridden the method from the Machine parent class

        System.out.println("Car started.");
    }

    @Override//annotation
    public void stop() {
        System.out.println("Car started");
    }

    public void showInfo(){
       System.out.println("Car name: " + name);
    }
}
