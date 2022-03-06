package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

public class N5Planet {
    public String name;
    public int moons;

    public N5Planet(String name, int moons){
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        N5Planet [] planets = {
                new N5Planet("Mercury",0),
                new N5Planet("Venus",0),
                new N5Planet("Earth",1),
                new N5Planet("Mars",2)
        };
        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
    }
}
