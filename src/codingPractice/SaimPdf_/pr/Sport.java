package codingPractice.SaimPdf_.pr;

public class Sport {
    /*
    Create a class called Sport
- instance variables: name, number of players, team based (boolean)

- Create a constructor to initialize the three fields

- Encapsulate the variables

- Bonus: prevent negative number of players to assigned and null or empty space to be assigned to name
     */

    String name;//Instance variable
    int numberPlayers;
    boolean teamBased;

    public Sport(String name,int numberPlayers,boolean teamBased){//constructor
        this.name = name;
        this.numberPlayers = numberPlayers;
        this.teamBased = teamBased;


    }
}
