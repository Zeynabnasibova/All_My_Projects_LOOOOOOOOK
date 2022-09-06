package JavaCertification.oracleJavaCertification;



public class N33Employee {
    String name;
    boolean contract;
    double salary;
    N33Employee(){
        this.name = new  String ("Jpe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }
    public String toString(){
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        N33Employee e = new N33Employee();
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
    }

}
