package saimDayByDay.day48_Static;

public class Song {
    String name;
    double length;
    String author;
    String publisher;
    String genre;

    public Song(String name){
        this.name = name;
    }

    public Song(String name, double length){
        // this.name = name;
        this(name);
        this.length = length;
    }

    public Song(String name, double length, String author){
//        this.name = name;
//        this.length = length;
        this(name, length);
        this.author = author;
    }

    public Song(String name, double length, String author, String publisher){
//        this.name = name;
//        this.length = length;
//        this.author = author;
        this(name, length, author);
        this.publisher = publisher;
    }

    public Song(String name, double length, String author, String publisher, String genre){
//        this.name = name;
//        this.length = length;
//        this.author = author;
//        this.publisher = publisher;
        this(name, length, author, publisher);
        this.genre = genre;
    }


}


/*
Song
	attribute
		name, length, author, publisher, genre
	constructors - Use whichever way you feel comfortable
		1st: initialize the name
		2nd: initialize the name and length
		3rd: initialize the name, length, author
		4th: initialize the name, length, author, publisher
		5th: initialize the name, length, author, publisher, genre
 */