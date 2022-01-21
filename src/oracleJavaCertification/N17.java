package oracleJavaCertification;

public class N17 {

    int x,y;
    public N17(int x,int y){
        initialize (x,y);
    }
    public void initialize(int x,int y){
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        N17 obj = new N17(x, y);
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(x + " " + y);

    }
}