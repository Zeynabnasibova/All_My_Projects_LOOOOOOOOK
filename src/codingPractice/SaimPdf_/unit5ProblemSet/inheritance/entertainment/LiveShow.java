package codingPractice.SaimPdf_.unit5ProblemSet.inheritance.entertainment;

public class LiveShow extends Entertainment {
    /**
     create a class LiveShow
     -> LiveShow is a child of Entertainment
     instance variables:
     - location (String)
     constructor:
     - initialize name, company, and location
     -> call super constructor
     -> hint: name value will be 'Live Show' for all subclasses
     */
    String location;
    public LiveShow(String name, String company,String location){
        super(name,company);
        this.location = location;
    }
}
