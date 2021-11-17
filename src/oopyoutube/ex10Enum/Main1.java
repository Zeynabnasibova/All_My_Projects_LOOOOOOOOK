package oopyoutube.ex10Enum;

public class Main1 {
    public static void main(String[] args) {

        Book b1 = new Book("Learn java","Oracle",Type.NOVEL);
        switch (b1.bookType){
            case NOVEL:
                System.out.println("Type NOVEL");
                break;
            case SCIENCE:
                System.out.println("Type SCIENCE");
                break;
            case PHANTASY:
                System.out.println("Type PHANTASY");
                break;
            case SCIENCE_FICTION:
                System.out.println("Type S_F");
                break;
            default:
                System.out.println("not have Type");
        }

    }
}
class Book {
    String name;
    String author;
    Type bookType;

    Book(String inputName, String inputAuthor, Type inputType){

        bookType = inputType;
        this.name = inputName;
        this.author = inputAuthor;
    }


}
enum Type{

    SCIENCE,
    NOVEL,
    PHANTASY,
    SCIENCE_FICTION


}
