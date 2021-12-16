package SaimPdf.unit5ProblemSet.inheritance.seasons;

public class Spring extends Seasons{
    /**
     Create a class Spring
     child class of Season
     constructor: set values to variables
     methods:
     activity(): Go Outside
     */

    public Spring(String name, int highestAverageTemp, int lowestAverageTemp ) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }

    public static void main(String[] args) {

      Spring obj = new Spring("Spring",95,75);

        System.out.println(obj.activity("Go Outside"));

    }


}
