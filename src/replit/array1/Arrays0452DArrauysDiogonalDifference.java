package replit.array1;

public class Arrays0452DArrauysDiogonalDifference {
    public static void main(String[] args) {


        int [] [] squareMatrix = new int [] [] {{1,4,9},{2,5,8},{3,6,9}};

        //int diagonal = squareMatrix[0][0] + squareMatrix[1][1] + squareMatrix[2]][2] - squareMatrix[2][0] + squareMatrix[1][1] + squareMatrix[0][2];

//int result = squareMatrix[0][0]+squareMatrix[2][2]-squareMatrix[2][0]-squareMatrix[0][2];
    }
}
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix is shown below:

1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 = 17. Their absolute difference is |15-17| = 2
 */