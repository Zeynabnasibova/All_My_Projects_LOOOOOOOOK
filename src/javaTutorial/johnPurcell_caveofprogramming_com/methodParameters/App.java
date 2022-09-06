package javaTutorial.johnPurcell_caveofprogramming_com.methodParameters;

class Robot{
public void speak(String text) {

    System.out.println(text);

  }
  public void jump(int height){
      System.out.println("Jumping: " + height);
  }
  public void move(String direction, double distance){
      System.out.println("Moving " + direction + " metres in direction " + direction);
  }
}


public class App {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi I'm Sam.");
     sam.jump(7);
     sam.move("Wait",12.2);

     String greeting = "Hello there.";
     sam.speak(greeting);

     int value = 14;
     sam.jump(value);

    }
}
