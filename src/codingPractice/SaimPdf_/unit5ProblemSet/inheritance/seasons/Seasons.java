package codingPractice.SaimPdf_.unit5ProblemSet.inheritance.seasons;

/**
 [Seasons] Inheritance Create a class Season
 instance variables
 - name (String)
 - highest average temperature - lowest average temperature
 */
public class Seasons {
    String name;
    int highestAverageTemp;
    int lowestAverageTemp;

    /**
     constructor:
     - initialize all fields
     */
    public Seasons(String name, int highestAverageTemp, int lowestAverageTemp){

        this.name = name;
        this.highestAverageTemp = highestAverageTemp;
        this.lowestAverageTemp = lowestAverageTemp;

    }
    /**
     methods:
     - activity(), toString()
     */

    public String activity(String firePlace){

return firePlace;
    }


    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }
}
