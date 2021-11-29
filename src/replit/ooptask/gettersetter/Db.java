package replit.ooptask.gettersetter;

public class Db {

private String data;
private int yint;

public Db(String inputdata, int inputyint){
    this.data = inputdata;
    this.yint = inputyint;
}

String getData(){

    return this.data;
}
int getYint(){

    return this.yint;
}

void setData(String inputdata){

    data = inputdata;

}
void setYint(int inputyint){

    yint = inputyint;

}


}
/*
The Db class will have two private instance variables. Create those variables and provide public getters and setters for them. Note: A constructor is provided.

Instance variables:
data (String)
name: yint (int)
Methods:
- getData()
- getYint()
- setData()
- setYint()

Example:

 Db db = new Db("aaa",123);

 System.out.println(db.getData());//aaa
 System.out.println(db.getYint());//123

 db.setData("zzz");
 db.setYint(200);

 System.out.println(db.getData());//zzz
 System.out.println(db.getYint());//200
 */