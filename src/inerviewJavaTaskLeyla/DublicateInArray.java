package inerviewJavaTaskLeyla;

public class DublicateInArray {

    public static void main(String[] args) {



        int[] arr = new int[]{7,1, 2, 3, 4, 5, 2, 5, 7};

        for(int i = 0; i < arr.length; i++){

            int uniquicount = 0;

            for(int j = 0;j < arr.length; j++){
                if(arr[i] == arr[j]){
                    uniquicount++;

                }
            }
            if(uniquicount > 1){

                System.out.println(arr[i]);

            }
        }


    }
}

//
//        for (int i = 0; i < arr.length; i++){//4
//
//            for(int j = i + 1; j < arr.length; j++){
////7 --> 1 2 3 4 5 2 5 7
//                //1 --> 2 3 4 5 2 5 7
//                //2 --> 3 4 2 5 7
//                //3--> 4 5 2 5 7
//                //4 --> 5 2 5 7
//                //5 -->2 5 7
//                //2 --> 5 7
//                //5 --> 7
//                //7
//
//             if(arr[i] == arr[j]){
//
//                 System.out.println(arr[j]);
//
//
//             }
//
//            }
//
//        }
