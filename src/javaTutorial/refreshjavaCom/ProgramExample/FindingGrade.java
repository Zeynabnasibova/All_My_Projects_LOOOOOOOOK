package javaTutorial.refreshjavaCom.ProgramExample;
class FindingGrade
{
    public static void main(String [] args)
    {
        int marks = 65;
        if(marks >= 80)
            System.out.println("A+ grade");
        else if(marks >= 60 && marks < 80)
            System.out.println("A grade");
        else if(marks >= 40 && marks < 60)
            System.out.println("B grade");
        else if(marks >= 30 && marks < 40)
            System.out.println("C grade");
        else
            System.out.println("D grade");
    }
}