package canvasOCASertification.OCAExamMaterials.OCAExamPart2;

public class N30 {
    public static void main(String[] args) {
        int data [] = {2010, 2013, 2014, 2015, 2014, 2014, 2015};
        int key = 2014;
        int count = 0;

        for(int each : data){
            if(each != key){
                count++;
                continue;
            }
        }
        System.out.println(count + " Found ");
    }
}
class N30a{

    public static void main(String[] args) {
        int data [] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;

        for(int each : data){
            if(each != key){
                count++;
                //continue;
            }
        }
        System.out.println(count + " Found ");
    }
}
class N30b{

    public static void main(String[] args) {
        int data [] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;

        for(int each : data){
            if(each == key){
                count++;
               // continue;
                break;
            }
        }
        System.out.println(count + " Found ");
    }
}