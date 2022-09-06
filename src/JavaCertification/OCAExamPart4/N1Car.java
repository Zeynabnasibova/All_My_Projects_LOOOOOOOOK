package JavaCertification.OCAExamPart4;

class Vehicle{
    String type = "4W";
    int maxspeed = 100;
    Vehicle(String type, int maxspeed){
        this.type = type;
        this.maxspeed = maxspeed;
    }
    //Vehicle(){}
}

 class N1Car extends Vehicle {
    String trans;
     N1Car(String trans){
       super("jo",1);
       this.trans = trans;
    }
 //public  final int n;
     public static void main(String[] args) {

     }
}
