package saimDayByDay.day44_CustomClassesAndObjects;

//class Animal
public class Animal {

    //instance variable
    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;

    //method

    //no static means there are instance methods

    public void eat(){

        System.out.println(species + " is eating");

    }
    public void sleeping(){

        System.out.println("This " + size + "animal is sleeping");

    }

}
