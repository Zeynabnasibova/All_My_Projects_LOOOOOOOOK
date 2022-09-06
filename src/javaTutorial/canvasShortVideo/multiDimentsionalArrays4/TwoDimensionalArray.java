package javaTutorial.canvasShortVideo.multiDimentsionalArrays4;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int [][] data = { {12,5,4},{23,113,32}};

        System.out.println(data.length);

        for(int i = 0; i < data.length; i++){
            System.out.println("***Row: " + i);
            for(int j = 0; j < data[i].length;j++){
                System.out.println(data[i][j]);
            }
            System.out.println();
        }

        System.out.println("For each Loop");

        for(int [] rows : data) {
            System.out.println("****Row :" );
            for (int columnData : rows){
                System.out.println(columnData + " ");
            }
        }
    }
}
