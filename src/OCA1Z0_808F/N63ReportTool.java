package OCA1Z0_808F;

public class N63ReportTool  extends   Tool{

   public void export(){

        System.out.println("RTool::export");
    }
}

interface Exportable{

    void export();
}
class Tool implements Exportable{
  public void export(){
        System.out.println("Tool::export");
    }
}
