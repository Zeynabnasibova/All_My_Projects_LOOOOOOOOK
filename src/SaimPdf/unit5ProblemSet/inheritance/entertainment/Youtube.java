package SaimPdf.unit5ProblemSet.inheritance.entertainment;

import java.util.ArrayList;

public class Youtube extends  Streaming{

    /**
     create a class Youtube
     -> Youtube is a child of Streaming
     instance variables:
     - video name (String)
     - channel name (String)
     - view count (int)
     - comments (ArrayList of Strings)
     constructor:
     - initialize name, company, duration, video name, channel name, view
     count, and comments
     */
    String videoName;
    String channelName;
    int countView;
    ArrayList<String> comments;

    public Youtube(String name, String company,double duration, String videoName, String channelName, int countView, ArrayList<String> comments){

        super(name,company,duration);
        this.videoName = videoName;
        this.channelName = channelName;
        this.countView = countView;
        this.comments = comments;


    }



}
