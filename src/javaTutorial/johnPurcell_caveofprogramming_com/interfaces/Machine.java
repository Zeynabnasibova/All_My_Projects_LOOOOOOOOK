package javaTutorial.johnPurcell_caveofprogramming_com.interfaces;

public class Machine implements Info{

    public int id = 7;
    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);

    }
}
