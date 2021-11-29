package oopyoutubeVladlenVojayev.ex6.ExtendsSuper;

public class Main {
    public static void main(String[] args) {

        Horse mustand = new Horse(true,"iha",(byte)4,"Risak","white");
        mustand.eat();

        Pegasus ares = new Pegasus(true,"igogo",(byte)4,"Risak","yellow",true);
        ares.eat();
        ares.fly();


    }
}
