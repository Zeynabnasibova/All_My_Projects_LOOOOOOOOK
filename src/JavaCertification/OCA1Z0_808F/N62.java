package JavaCertification.OCA1Z0_808F;

public class N62 {


}
interface Downloadable{
    public void dowonload();
}
interface Readable extends Downloadable{

    public void readBook();
}
abstract   class Book implements Readable{
    public void readBook(){
        System.out.println("Read Book");
    }
}

class EBook extends Book{

    //public void readBook(){}
    public void dowonload(){}
}
