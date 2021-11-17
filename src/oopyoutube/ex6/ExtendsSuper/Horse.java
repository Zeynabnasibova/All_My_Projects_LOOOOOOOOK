package oopyoutube.ex6.ExtendsSuper;

public class Horse extends  Animals{


    String breed;
    String color;

    public Horse(boolean inputVegetarian, String inputSpeak, byte inputPaws, String inputBreed, String inputColor){
        super(inputVegetarian,inputSpeak,inputPaws);
        this.breed = inputBreed;
        this.color = inputColor;


    }



}
