package JavaCertification.OCAExamPart3.N25;

import java.io.IOException;
import java.nio.CharBuffer;

interface Downloadable{
    public void download();
}
interface Readable1 extends Downloadable {
    public void readBook();
}

abstract class Book implements Readable {

    public void readBook(){
        System.out.println("Read Book");
    }
}
public class N25EBook1 extends Book {

    public void readBook(){
        System.out.println("Read E-Book");
    }
    public void download(){}

    public static void main(String[] args) {
   Book book1 = new N25EBook1();
        book1.readBook();
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
