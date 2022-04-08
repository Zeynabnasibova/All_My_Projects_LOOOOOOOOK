package practiceAllInterviewCodingTasksSaim;

import java.util.Arrays;

public class ArrayNUniquiIntegersThatSumUpTo0_ {
    /*
Write a function:

that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */


    public static int[] solution(int n){

        int[] result = new int[n];

        int sum = 0;

        for(int i=0; i < n-1; i++) {//go antil befor last one elemnt

            result[i] =i;

            sum += i;

        }

        result[n-1] = -sum;//for last element use this one

        return result;
        // output 0 + 1 + 2 = 3 - 3 = 0

    }

    public static void main(String[] args) {
int n = 4;
        System.out.println(Arrays.toString(solution(n)));

        // output 0 + 1 + 2 = 3 - 3 = 0
    }
}
