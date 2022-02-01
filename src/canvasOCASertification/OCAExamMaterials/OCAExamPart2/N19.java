package canvasOCASertification.OCAExamMaterials.OCAExamPart2;

import java.util.Arrays;

public class N19 {
    public static void main(String[] args) {
        String [][]chs = new String [2][];
        chs[0] = new String[2];
        chs[1] = new String [5];

        int i = 97;

        for(int a = 0; a < chs.length; a++){
            for (int b = 0; b < chs.length; b++){
                chs[a][b] = "" + i;
                i++;
            }
        }
        System.out.println(Arrays.deepToString(chs));
        for (int a = 0; a < chs.length; a++){
            for (int b = 0; b < chs[a].length; b++){
                System.out.print(chs[a][b] + " ");
            }
        }



    }
}
