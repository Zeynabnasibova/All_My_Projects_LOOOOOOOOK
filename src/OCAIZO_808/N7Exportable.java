package OCAIZO_808;

public interface N7Exportable {
    void export();
}
class Tool implements N7Exportable{
   public void export(){
       System.out.println("Tool ::export");
    }
}
class ReportTool extends Tool implements N7Exportable{
    public void export(){
        System.out.println("RTool::export");
    }
    public static void main(String []args){
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(N7Exportable ex){
        ex.export();
    }

}
