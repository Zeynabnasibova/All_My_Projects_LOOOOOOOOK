package SaimPdf.unit5ProblemSet.inheritance.entertainment;

public class Netflix extends  Streaming {
    /**
     create a class Netflix
     -> Netflix is a child of Streaming
     instance variables:
     - show name (String)
     - episode number (int) - season number (int)
     constructor:
     - initialize name, company, duration, show name, episode number, and
     season number
     -> call super constructor
     */

    String showName;
    int episodeNumber;
    int seasonNumber;

    public Netflix(String name, String company,double duration,String showName, int episodeNumber, int seasonNumber){

        super(name,company,duration);

this.showName = showName;
this.episodeNumber = episodeNumber;
this.seasonNumber = seasonNumber;




    }

}
