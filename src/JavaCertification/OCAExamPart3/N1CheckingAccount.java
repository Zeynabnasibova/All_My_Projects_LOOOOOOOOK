package JavaCertification.OCAExamPart3;

public class N1CheckingAccount {
    public int amount;

    public N1CheckingAccount(int amount){
        this.amount = amount;

    }
    public int getAmount(){
        return amount;
    }
    public void changeAmount(int x){
        amount += x;

    }

    public static void main(String[] args) {
        N1CheckingAccount acct = new N1CheckingAccount(1000);
      //  System.out.println(acct.getAmount());
        acct.changeAmount(-acct.amount);
//        acct.amount = 0;
//        acct.changeAmount(-acct.getAmount( ));
          System.out.println(acct.getAmount());





    }
}
