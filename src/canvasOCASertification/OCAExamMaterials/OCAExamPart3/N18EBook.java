package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

interface Readable {
    void readBook();
    public void setBookMark();
}

abstract class Book implements Readable{

    public void readBook(){}
 //public void setBookMark(){}
}
public class N18EBook extends Book {

    public void readBook(){}
    public void setBookMark(){}

    public static void main(String[] args) {
        N18EBook book1 = new N18EBook();
        book1.readBook();
    }
}

