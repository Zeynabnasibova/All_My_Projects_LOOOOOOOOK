package saimDayByDay.day38_MethodOverloading.practice;

public class UniqueOfElements {

/*
given an int array, find and print all the unique elements
 */

    public static String getUniqueOfElement(int [] arr){

        String unique = "";
        for(int i = 0; i < arr.length;i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    count++;
                }
            }
            if(count == 1) {

                unique += arr[i] + ", ";
            }

        }
        return unique;

    }

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 1};

        System.out.println(getUniqueOfElement(arr));
    }
}
