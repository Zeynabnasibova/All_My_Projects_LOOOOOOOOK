package oracleJavaCertification;

public class N9 {
    int r;
    N9(int r){
        this.r = r;
    }
}

class DVD extends N9 {
    int c;
    DVD (int r, int c){
    super(r);
    this.c = c;
}
}
