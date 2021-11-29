package oopyoutubeVladlenVojayev.ex6Polymorphism;


public class Pegasus extends Horse {

    boolean isFly;

    public Pegasus(boolean inputVegetarian, String inputSpeak, byte inputPaws, String inputBreed, String inputColor, boolean inputIsFly){

        super(inputVegetarian,inputSpeak,inputPaws,inputBreed, inputColor);

        this.isFly = inputIsFly;


    }

    void fly(){

        System.out.println("I can fly");
    }
}
