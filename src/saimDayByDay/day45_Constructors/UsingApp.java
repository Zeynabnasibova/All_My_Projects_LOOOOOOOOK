package saimDayByDay.day45_Constructors;

public class UsingApp {

    public static void main(String[] args) {

        App firstApp = new App(); // created the object

        // assign value to to variables

        firstApp.name = "Google";
        firstApp.version = 4.0;
        firstApp.isFree = true;

        // calling update method

        //App.update() this doesn't work because update method is an instance method

        firstApp.update();

        // printing our information

        System.out.println(firstApp); // this line is trying to print out object, but gives memory location

        System.out.println("App information");
        System.out.println("Name: " + firstApp.name);
        System.out.println("Version: " + firstApp.version);
        System.out.println(firstApp.isFree ? "App is free" : "App cost some money");

    }
}