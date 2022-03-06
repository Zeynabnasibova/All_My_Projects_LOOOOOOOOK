package canvasOCASertification.OCAExamMaterials.OCAExamPart3;

public class N22MyField {
    int x, y;

    public void doStuff(int x, int y) {
        this.x = x;
        y = this.y;
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {

        N22MyField m1 = new N22MyField();
        m1.x = 100;
        m1.y = 200;

        N22MyField m2 = new N22MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();

    }
}