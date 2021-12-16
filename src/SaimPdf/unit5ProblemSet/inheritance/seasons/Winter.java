package SaimPdf.unit5ProblemSet.inheritance.seasons;

public class Winter extends  Seasons{
    /**
     Create a class Winter
     child class of Season
     constructor: set values to variables

     methods:
     activity(): Print Use Fireplace
     */
    public Winter(String name, int highestAverageTemp, int lowestAverageTemp ) {
        super(name, highestAverageTemp, lowestAverageTemp);

    }

    public static void main(String[] args) {

        Seasons obj = new Seasons("Winter", 100, 72);
        System.out.println(obj.toString());
        System.out.println(obj.activity("FirePlace"));



    }
}
