package SaimPdf.unit5ProblemSet.inheritance.entertainment;

public class KevinHart extends LiveShow {
    /**
     create a class KevinHart
     -> KevinHart is a child of LiveShow
     instance variables:
     - performer (String)
     - date (String format Ex: mm/dd/yyyy)
     constructor:
     - initialize name, company and location, performer, date
     -> call super constructor
     -> hint: name value will be 'Live Show' for all subclasses
     create an object of KevinHart to use the constructors, read the value of each variable to check if everything is working as expected
     List the is a relation of all the classes
     */

    String perform;
    String date;

    public KevinHart(String name, String company,String location,String perform,String date){

    super(name,company,location);

    this.perform = perform;
    this.date = date;

    }

    public static void main(String[] args) {

        KevinHart obj = new KevinHart("Samsung","Netflix","6605 SW Chestnut Hill",
                "Good","16/23.2021");
        System.out.println(obj.name);


    }

}
