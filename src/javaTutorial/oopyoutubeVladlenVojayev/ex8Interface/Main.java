package javaTutorial.oopyoutubeVladlenVojayev.ex8Interface;

public class Main {
    public static void main(String[] args) {

        Printable b1 = new Book("Java ","Oracle");
        b1.print();

        Printable b2 = new Journal("C++");
        b2.print();
    }

}



interface Printable{
    default void print(){
        System.out.println("Dont have name");

}
static void read(){

    System.out.println("I read");
    }
}

interface A extends Printable{

    void b();
}

class Book implements Printable, A{

    String name;
    String author;


    Book(String inputName, String inputAuthor){
        this.name = inputName;
        this.author = inputAuthor;

    }
    public void print(){
        System.out.println("name " + name + " autor" + author);
    }
    public void b(){
        System.out.println("Method");
    }
}
class Journal implements Printable{

    private String name;

    String getName(){
        return name;
    }
    Journal(String inputName){
        this.name = inputName;
    }
//    public void print(){
//        System.out.println(name);
//    }
}