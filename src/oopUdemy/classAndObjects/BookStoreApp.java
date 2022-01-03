package oopUdemy.classAndObjects;

public class BookStoreApp {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Algebra";
        book1.author = "Zeynab";
        book1.pubDate = 1990;
        book1.price = 10.9;

        Book book2 = new Book();
        book2.title = "Language art";
        book2.author = "Mahir";
        book2.pubDate = 2000;
        book2.price = 9.89;

        book1.displayInfo();
        book2.displayInfo();
    }
}