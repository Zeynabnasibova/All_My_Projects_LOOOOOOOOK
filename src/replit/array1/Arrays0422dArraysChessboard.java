package replit.array1;

import java.util.Arrays;

public class Arrays0422dArraysChessboard {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        int a = 1;

        for(int i = 0; i < 8; i++){

            char count = 'a';

            for(int j = 0; j < 8; j++){

                chessBoard[i][j] = a + "" + count;

                count++;

            }

            a++;
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }


}
