package oopUdemy.abstraction;

interface Fruit {

    abstract public void calculateprice();  // abstract method meant to be override.
    abstract public void  color();

}


class Apple implements Fruit {

    public void policy1() {

    }

    @Override
    public void calculateprice() {
        System.out.println("Canda: $ 2.99 ");

    }

    @Override
    public void color() {
        System.out.println("apple color is red");

    }
}
class Banana implements Fruit{

    @Override
    public void calculateprice() {
        System.out.println("Florida: price: $ 2");

    }
    public void color(){

        System.out.println("banana color yellow");

    }
}

public class mainClassForRun{
    public static void main(String[] args) {

        Fruit apple = new Apple();
        // when abstract class is reference we can only give regular child class for the object type


        apple.calculateprice();
        apple.color();

        Fruit banana = new Banana();
        banana.calculateprice();
        apple.color();
    }


}