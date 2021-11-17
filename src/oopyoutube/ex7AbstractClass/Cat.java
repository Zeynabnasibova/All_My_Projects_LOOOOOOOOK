package oopyoutube.ex7AbstractClass;

public class Cat extends Animals{

    String color;
    public Cat(String inputColor ){
        super(false,"myau",(byte)4);

        this.color = inputColor;
    }

    @Override
    void eat(){
        System.out.println("I eat viskas");
    }
}
