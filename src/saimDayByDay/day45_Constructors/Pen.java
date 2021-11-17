package saimDayByDay.day45_Constructors;

public class Pen {

    String color;

    public Pen(String str){ // constructor
        System.out.println("Made Pen object " + str);
        color = str;
    }


    public static void main(String[] args) {

        // old way:

        Pen obj = new Pen("");
        obj.color = "red";

        Pen pen = new Pen("red");
        System.out.println(pen.color);

        new Pen("blue");

        new Pen("yellow");

    }

}