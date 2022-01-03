package muhtar.gitJavaFundamentals.OOP.Encapsulations;

class mydata{
    private String username="Muhtar";   // muradil
    final private long cardNum = 1234567;
    // if the private data is final, we can only have the getter of encapsulation:
    //		because setter attempts to modify the private data and final keyword reuses to be modified

    //	public void setCardnum(long cardNum) {
    //		 this.cardNum =cardNum;
    //	}


    // getter:public DataType name() { return privatedate; }
    public String getUsername() {
        return username;
    }

    // setter: public void name(DataType data) { privateData = date ; }
    public void SetUserName(String username) {
        this.username = username;
    }


}


public class Practices {
    public static void main(String[] args) {
        mydata obj=new mydata();
        System.out.println(	obj.getUsername()  );

        //		System.out.println( obj.SetUserName("Muradil") );
        obj.SetUserName("Muradil");
        System.out.println(	obj.getUsername()  );


    }

}