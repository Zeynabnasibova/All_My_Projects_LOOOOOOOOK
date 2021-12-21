package johnPurcell_caveofprogramming_com.inheritance;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();


        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
        car1.stop();
    }
}
