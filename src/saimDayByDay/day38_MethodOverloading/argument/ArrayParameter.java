package saimDayByDay.day38_MethodOverloading.argument;

public class ArrayParameter {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6};


        printArray(arr);
        System.out.println();
        printArray(1, 2, 3, 4);

        System.out.println();

        String [] str = {"Zeynab"};
        printArray(str);
        printArray("A","B","C");
    }


    public static void printArray(int... arr) {
        for (int each : arr) {
            System.out.println(each);
        }
    }

    public static void printArray(String... str) {
        for (String each : str) {
            System.out.println(each);
        }
    }
}