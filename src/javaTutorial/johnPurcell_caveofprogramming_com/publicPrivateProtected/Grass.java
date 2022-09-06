package javaTutorial.johnPurcell_caveofprogramming_com.publicPrivateProtected;


import javaTutorial.johnPurcell_caveofprogramming_com.publicPrivateProtected.world.Plant;

public class Grass extends Plant {
    public Grass() {

        // Won't work --- Grass not in same package as plant, even though it's a subclass
        // System.out.println(this.height);
    }
}