package oopUdemy.constructor;

public class Book {

    String title;
    String author;
    int pubDate;
    double price;

    Book(String title, String author, int pubDate, double price){
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.price = price;
    }

    void displayInfo(){
        System.out.println(title + "|" + author + "|" + pubDate +"|" + price);
    }
}
