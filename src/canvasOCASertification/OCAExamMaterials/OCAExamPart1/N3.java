package canvasOCASertification.OCAExamMaterials.OCAExamPart1;

public class N3 {
    public static void main(String[] args) {
        int [] [] arr = { {1,2,3},{3,4}};
        for(int i = 0; i < 2 ; i++){
            for(int j = 0; j < 2; j++ ){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
 class N9a {
     public static void main(String[] args) {
         int[][] arr = {{1, 2, 3}, {3, 4}};
         for (int i = arr.length - 1; i >= 0; i--) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j] + " ");
             }
         }
     }
 }
