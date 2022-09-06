package javaTutorial.oopyoutubeVladlenVojayev.ex2N12;

public class Human {

    int age;//instance variable
    String name;

    Human(int inputage,String inputname){
        this.age = inputage;
        this.name = inputname;

    }

    static void sayHello(String name){//instance method

        System.out.println("Hello " + name);
    }


}
