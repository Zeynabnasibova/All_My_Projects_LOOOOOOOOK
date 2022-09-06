package javaTutorial.muhtar.gitJavaFundamentals.OOP.Encapsulations;

public class Source {
    public static void main(String[] args) {
        Datas obj=new Datas();
        int mynum= obj.getnum();
// obj.getnum()=300;    getter is return method, and it's for read only in terms of private data.

        System.out.println( obj.getnum() );
        System.out.println(mynum);

        obj.setnum(500);
        System.out.println( obj.getnum() );


    }
}