package interviewAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMissingNumber {

    public static void main(String[] args) {

int missingNUmberOne = 0;//5
int secondMissingNumber = 0; // 8
        //you have list of number.and you should find find missing number
        ArrayList<Integer> listNumber = new ArrayList<Integer>(Arrays.asList(0,9,7,1,2,3,8,4,10));
        Collections.sort(listNumber);// 0 1 2 3 4 6 7 8 9 10
        System.out.println(listNumber);
        for(int i = 0; i < listNumber.size(); i++){// 0 1 2 3 4 6 7 8 9 10
            if(listNumber.get(i) != i ){
                missingNUmberOne += i;
                break;
            }
        }

        for(int i = missingNUmberOne; i < listNumber.size(); i++){//5
            if(listNumber.get(i)  != i+1){// 6 != 6
                secondMissingNumber += i+1;
                break;
            }
        }
        System.out.println(missingNUmberOne);
        System.out.println(secondMissingNumber);

    }
}
