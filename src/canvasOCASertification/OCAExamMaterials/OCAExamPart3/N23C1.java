package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

class C2{
    public void displayC2(){
        System.out.println("C2");
    }
}

interface I {

    public void displayI();

}

 class N23C1 extends C2 implements I {

     @Override
     public void displayI() {

     }

     public static void main(String[] args) {
         C2 obj1 = new N23C1();
         I obj2 = new N23C1();

//         C2 s = obj2;
//         I t = obj1;
     }
 }
