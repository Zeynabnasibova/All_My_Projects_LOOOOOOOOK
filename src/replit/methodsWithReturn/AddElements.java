package replit.methodsWithReturn;
import java.util.Scanner;
import java.util.Arrays;

public class AddElements {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array length");
        int size = input.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter your first arrays  number " + (i + 1));
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter your seconds arrays number " + (i + 1));
            arr2[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(addElements(arr1,arr2)));


    }
public static int [] addElements(int [] arr1, int [] arr2){

        int [] addElement = new int [arr1.length];

        for (int i = 0; i < addElement.length; i++){

            addElement[i] = arr1[i] + arr2[i];


        }

        return addElement;

}
}
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);

return array after adding values in the arrays:
[21, 40, 550, 47, 1102]
 */