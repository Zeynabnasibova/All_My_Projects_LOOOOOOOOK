package oopUdemy.constructor;

public class BookStoreApp {
    public static void main(String[] args) {

       Book book1 = new Book( "Algebra","Zeynab",1990,10.9);

    Book book2 = new Book("Language art", "Mahir",2000,9.89);

        book1.displayInfo();
        book2.displayInfo();
    }
}