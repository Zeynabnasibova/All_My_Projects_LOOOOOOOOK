package oopyoutube.ex6.ExtendsSuper;

public class Animals {

    boolean vegetarian;
    String speak;
    byte paws;// legs

    public Animals(boolean inputVegetarian, String inputSpeak, byte inputPaws){

        this.vegetarian = inputVegetarian;
        this.speak = inputSpeak;
        this.paws = inputPaws;

    }

    boolean getVegetarian(){

        return this.vegetarian;
    }

    String getSpeak(){

        return this.speak;
    }


    byte getPaws(){

        return this.paws;
    }
    void eat(){

        System.out.println("I eat");
    }

}
