package canvasOCASertification.OCAExamMaterials.OCAExamPart2;

import java.util.Arrays;

public class N37 {
    public static void main(String[] args) {

        String [] strs = new String[3];
        int idx = 0;

        for (String s : strs){
            strs[idx].concat(" element " + idx);
            idx++;
        }
        System.out.println(Arrays.toString(strs));
    }
}
