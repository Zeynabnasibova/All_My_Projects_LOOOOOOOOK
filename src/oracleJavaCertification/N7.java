package oracleJavaCertification;
 class N7 {

    static int i;
    int j;
    public  static void main(String [] args ){

        N7 obj1 = new N7();
        N7 obj2 = new N7();

        obj1.i = 3;
        obj1.j = 4;

        obj2.i = 5;
        obj2.j = 6;

        System.out.println(
                obj1.i + " " +
                        obj1.j + " " +
                        obj2.i + " " +
                        obj2.j);




    }
}
