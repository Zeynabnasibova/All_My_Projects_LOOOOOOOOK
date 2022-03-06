package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

public class N13Person {
    String name;
    int age = 25;
    public N13Person(String name){
        //this("",8);
        setName("Zeynab");
    }
    public N13Person(String name, int age){
       // N13Person(name);
    //    this(name);
        setAge(age);
    }
    public String getName(){
    return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(int age){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String show(){
        return name + " " + age;
    }

    public static void main(String[] args) {

    }


}
