package javaTutorial.johnPurcell_caveofprogramming_com.enumTypes;

public enum Animal {
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal is called: " + name;
    }
}