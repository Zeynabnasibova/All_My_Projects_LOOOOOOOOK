package JavaCertification.OCAExamPart3;

public class N6CheckingAccount {
    public int amount;
    public N6CheckingAccount(){
        this.amount = 100;

    }
    public static void main(String [] args){
        N6CheckingAccount acct = new N6CheckingAccount();
        acct.amount = 100;
        System.out.println(acct.amount);


    }
}
