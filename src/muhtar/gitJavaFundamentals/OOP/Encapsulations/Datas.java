package muhtar.gitJavaFundamentals.OOP.Encapsulations;

public class Datas {
    /* Encapsulation:1. is only needed when there is private data.
                     2. grants other objects get access to the private data Through getter and setter
                     3. if the private data is final, then we can only have getter. CAN NOT have Setter
            */
    private int num=200;     //A
    // private data is visible only within the classes.

    public int getnum() {
        return num;
    }

    public void setnum(int num) {   //B
        this.num=num;   //  A = B
        //	num=aa;
    }




}