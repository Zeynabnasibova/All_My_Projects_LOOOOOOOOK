package SaimPdf.unit5ProblemSet.inheritance.seasons;

/**
 Create a class CheckSeason
 create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class
 List the is a relation of all the classes
 */
public class CheckSeason {
    public static void main(String[] args) {
  Winter win = new Winter("Winter", 100, 72);
        System.out.println(win.toString());
        System.out.println(win.activity("FirePlace"));

  Summer sum = new Summer("Summer",120,100);
        System.out.println(sum.toString());
        System.out.println(sum.activity("Drink Limonade"));

 Fall fall = new Fall("Fall",90,70);
        System.out.println(fall.toString());
        System.out.println(fall.activity("Read A Book"));

 Spring spr = new Spring("Spring",95,75);
        System.out.println(spr.toString());
        System.out.println(spr.activity("Go Outside"));


    }
}
