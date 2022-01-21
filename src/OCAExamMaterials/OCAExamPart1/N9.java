package OCAExamMaterials.OCAExamPart1;

public class N9 {
    public static void main(String[] args) {
        int [] [] arr = { {1,2,3},{3,4}};
        for(int i = arr.length-1; i >= 0;i--){
            for(int j = 0; j < arr[i].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

