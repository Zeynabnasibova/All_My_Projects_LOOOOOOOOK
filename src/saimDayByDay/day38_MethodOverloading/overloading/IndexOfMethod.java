package saimDayByDay.day38_MethodOverloading.overloading;

public class IndexOfMethod {

    /*
    Create a method that will accept an array and element
    return the index of the first occurrence of the element

    if the element does not exist in our array, we will return -1

    Start with int array
    after: overload to work with String array
     */

    public static int indexOfMethod(int [] arr, int element){

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == element){
                return arr[i];
            }

        }
        return -1;
    }
    public static int indexOfMethod(String [] str, String leter){

        for(int i = 0; i < str.length; i++){
        if(str[i].equals(leter)){
            return str[i].indexOf(i);
        }

    }
        return -1;
}

    public static void main(String[] args) {
int [] arr = {1,2,3};
int number = 1;

String [] str = {"A","B","C"};
String letter = "B";
        System.out.println(indexOfMethod(str,letter));
        System.out.println(indexOfMethod(arr,number));

    }
}
