package mart.w3resourceTask.basicPart1.mart1.array;

import java.util.Arrays;

public class N1_10 {


}
class N1{
    /*
    1. Write a Java program to sort a numeric array and a string array. Go to the editor

Click me to see the solution
*/

    public static void main(String [] args){
            int [] arr = new int []{2 ,5, 7,3, 1};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            String [] strArr = new String [] {"Zeynab", "Mahir", "Movlud", "ZehraNur", "Anar"};
            Arrays.sort(strArr);
            System.out.println(Arrays.toString(strArr));

    }
        }

        class N2{
    /*
2. Write a Java program to sum values of an array. Go to the editor

Click me to see the solution
*/
public static void main(String [] args){

    int [] arr = new int [] {1, 3, 4, 5};
    int sum = 0;
    for(int i = 0; i < arr.length;i++){
        sum += arr[i];
    }
    System.out.println(sum);
}

}
class N3{

/*
3. Write a Java program to print the following grid. Go to the editor

Expected Output :

- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
Click me to see the solution
*/
public static void main (String []  args){
    for(int i = 0; i < 10; i++){
        System.out.println("----------");
    }

    int [][]a = new int[10][10];
    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
            System.out.printf("%2d", a[i][j]);
        }
        System.out.println();
    }
}
}
class N5{
/*
4. Write a Java program to calculate the average value of array elements. Go to the editor

Click me to see the solution
*/
public static void main (String [] args){
    int [] arr= new int [] {1,2,3,4,5};
    int sum = 0;
    int average = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    average = sum / arr.length;
    System.out.println(average);
}
}

class N6 {
/*
5. Write a Java program to test if an array contains a specific value. Go to the editor

Click me to see the solution
*/
public static void main(String [] args){
    int [] arr = new int [] {1,2,3,4,5};
    int num = 5;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == 5){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
}
/*
6. Write a Java program to find the index of an array element. Go to the editor

Click me to see the solution

7. Write a Java program to remove a specific element from an array. Go to the editor

Click me to see the solution

8. Write a Java program to copy an array by iterating the array. Go to the editor

Click me to see the solution

9. Write a Java program to insert an element (specific position) into an array. Go to the editor

Click me to see the solution

10. Write a Java program to find the maximum and minimum value of an array. Go to the editor
     */

