package JavaCertification.oracleJavaCertification;

class N13 {
     int x;
     N13(){
         this(10);
     }
    N13(int x) {

    }
    }
    class Car extends N13{
         int y;
         Car() {
             super(10);
         }
         Car(int y){
             super(y);
             this.y = y;
         }
         public String toString(){
             return super.x  + ":" + this.y;
         }


    public static void main(String[] args) {

         N13 y = new Car(20);
        System.out.println(y);


    }
}
