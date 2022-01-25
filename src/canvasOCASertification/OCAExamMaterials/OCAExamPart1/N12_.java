package canvasOCASertification.OCAExamMaterials.OCAExamPart1;

public class N12_ {
    public static void main(String[] args) {
        int wd =0;
        String [] days = {"sun", "mon", "wed", "sat"};
        for(int i = 0; i < days.length; i++){
            switch (days[i]){
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println(wd);
    }
}
