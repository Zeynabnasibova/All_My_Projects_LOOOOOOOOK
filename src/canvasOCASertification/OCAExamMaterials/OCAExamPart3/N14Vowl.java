package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

public class N14Vowl {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;

        N14Vowl obj1 = new N14Vowl();
          N14Vowl obj2 = obj1;
        //N14Vowl obj2 = new N14Vowl();

        obj1.var = 'i';
        obj2.var = 'o';

        System.out.println(var1 + ", " + var2);// a a
        System.out.println(obj1.var + ", " + obj2.var);

    }
}
