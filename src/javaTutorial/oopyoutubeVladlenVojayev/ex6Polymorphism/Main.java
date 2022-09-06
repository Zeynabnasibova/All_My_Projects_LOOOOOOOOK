package javaTutorial.oopyoutubeVladlenVojayev.ex6Polymorphism;


public class Main {
    public static void main(String[] args) {

        Horse mustand1 = new Horse(true,"iha",(byte)4,"Risak","white");
   mustand1.eat();

   Animals murka = new Animals(false,"myau",(byte)4);
   murka.eat();


       Pegasus ares1 = new Pegasus(true,"igogo",(byte)4,"Risak","yellow",true);

        ares1.fly();

        ares1.eat();


    }
}
