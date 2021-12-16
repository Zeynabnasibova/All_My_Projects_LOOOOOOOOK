package SaimPdf.unit5ProblemSet.inheritance.seasons;

public class Fall extends Seasons{
    /**

     Create a class Fall
     child class of Season
     constructor: set values to variables
     methods:
     activity(): Read A Book
     */
    public Fall(String name, int highestAverageTemp, int lowestAverageTemp ) {
        super(name, highestAverageTemp, lowestAverageTemp);

    }

    public static void main(String[] args) {

        Fall obj = new Fall("Fall",90,70);
        System.out.println(obj.activity("Read A Book"));

    }

}
