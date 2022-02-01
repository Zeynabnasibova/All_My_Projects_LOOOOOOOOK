package certification_questionscom;

public class MainAbstraction {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle();
        obj.printSides(4);
        obj.getArea();
    }
}
abstract class Polygon{
int a = 9;
    abstract void getArea();
    int b = 9;
    void printSides(int side){
        System.out.println("This polygon has " + side + "sides") ;
    }
}
class Rectangle extends Polygon{

    void getArea(){
        System.out.println("Area of Rectangle");
    }
}
