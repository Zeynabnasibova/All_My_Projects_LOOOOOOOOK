package oopyoutubeVladlenVojayev.ex6Polymorphism;


public class Horse extends Animals {


    String breed;
    String color;

    public Horse(boolean inputVegetarian, String inputSpeak, byte inputPaws, String inputBreed, String inputColor){
        super(inputVegetarian,inputSpeak,inputPaws);
        this.breed = inputBreed;
        this.color = inputColor;


    }
    @Override
    void eat() {
        System.out.println("I eat green sweat");
    }



}
