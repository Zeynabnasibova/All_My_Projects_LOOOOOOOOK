package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

public class Car {
    private String modelName = "Mustang";

    public static void main(String[] args) {

        Vehicle obj = new Vehicle();
        
    }



}
class Vehicle {
    protected String brand = "Force";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}