package codingPractice.replit_.variable1;

import java.util.Scanner;

public class ShoppingList1 {

    public static void main(String[] args) {


        /*
        In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = input.next();
        double price1 = input.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String item2 = input.next();
        double price2 = input.nextDouble();

        System.out.println("Enter Item3 and its price:");
        String item3 = input.next();
        double price3 = input.nextDouble();

        double totalPrice = price1 + price2 + price3;

        System.out.println("Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + "Price: " + price2 + ", Item3: " + item3 + "Price: " + price3);

        System.out.println("Total price: " + totalPrice );
    }
}
