package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

public class N4Employee {
    String name;
    boolean contract;
    double salary;

    public N4Employee(){
        this.name = new String("Jpoe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }
    public String toString(){

        return name + " : " + contract + " : " + salary;
    }

    public static void main(String[] args) {
        N4Employee e = new N4Employee();
        e.name ="Joe";
        e.contract = true;
        e.salary = 100;
        System.out.println(e);

    }

}
