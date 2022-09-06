package codingPractice.SaimPdf_.unit5ProblemSet.inheritance.seasons;

public class Summer extends Seasons{
    /**
     Create a class Summer child class of Season
     constructor: set values to variables
     methods:
     activity(): Drink Lemonade
     */
public Summer(String name, int highestAverageTemp, int lowestAverageTemp){
    super(name, highestAverageTemp, lowestAverageTemp);
}

    public static void main(String[] args) {
        Seasons obj = new Seasons("Summer",120,100);
        System.out.println(obj.activity("Drink Limonade"));

    }


}
