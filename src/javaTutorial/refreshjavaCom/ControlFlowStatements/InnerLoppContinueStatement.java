package javaTutorial.refreshjavaCom.ControlFlowStatements;

class InnerLoppContinueStatement
{
    public static void main(String [] args) {
        for(int i=1; i<=4; i++) {
            System.out.println("Outer loop i = "+i);
            for(int j=1; j<=3; j++) {
                if(i==2) {
                    continue;
                }
                System.out.println("  j = "+j);
            }
        }
        System.out.println("line after outer for loop");
    }
}