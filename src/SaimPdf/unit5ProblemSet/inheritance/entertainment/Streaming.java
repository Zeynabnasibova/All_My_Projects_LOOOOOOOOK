package SaimPdf.unit5ProblemSet.inheritance.entertainment;

public class Streaming extends Entertainment {

    /**
     create a class Streaming
     -> Streaming is a child of Entertainment
     instance variables:
     - duration (double)
     constructor:
     - initialize name, company, and duration
     -> call super constructor
     -> hint: name value will be 'Streaming' for all subclasses
     */

    double duration;

   public Streaming(String name, String company,double duration){
     super(name,company);
     this.duration = duration;
   }

}
