package SaimPdf.unit5ProblemSet.interfacePractice;
// Pig "implements" the Animal interface
public class Pig implements Animal {
    // The body of animalSound() is provided here
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");

    }

    @Override
    public void run() {
        // The body of sleep() is provided here
        System.out.println("tik tik");
    }

    @Override
    public void sleep(){
        System.out.println("Zzzz");

    }
}
class Main {
    public static void main(String[] args) {

    Pig obj = new Pig();

    obj.animalSound();

    obj.run();

    obj.sleep();



    }
}
