package canvasOCASertification.OCAExamMaterials.OCAExamPart2;

public class N2 {

    public static void main(String[] args) {
        String [] arr = {"A","B", "C", "D"};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
            if(arr[i].equals("C")){
                continue;
               //break;
            }
            System.out.println("Work done");
            break;
        }
    }
}
