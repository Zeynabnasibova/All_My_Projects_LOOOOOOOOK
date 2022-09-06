package javaTutorial.oopyoutubeVladlenVojayev.ex1;

public class Rectangle {

 int width;
 int height;

 public Rectangle(int w, int h){

     this.width = w;
     this.height = h;

 }
 public  void  calArea(){

     System.out.println(width * height);
 }

    public static void main(String[] args) {

     Rectangle obj = new Rectangle(5,10);
     obj.calArea();
    }

}
