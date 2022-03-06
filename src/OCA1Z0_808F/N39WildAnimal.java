package OCA1Z0_808F;


class Animal {
    String type = "Canie";
    int maxSpeed = 60;

    Animal () {

    }

    Animal (String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
public class N39WildAnimal extends Animal {
    String bounds;
    N39WildAnimal(String bounds){
        super();
        this.bounds = bounds;
    }
    N39WildAnimal(String type, int maxSpeed, String bounds){
        super(type,maxSpeed);
        this.bounds =  bounds;
    }

    public static void main(String[] args) {
        N39WildAnimal wolf = new  N39WildAnimal("Long");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
    }

}
