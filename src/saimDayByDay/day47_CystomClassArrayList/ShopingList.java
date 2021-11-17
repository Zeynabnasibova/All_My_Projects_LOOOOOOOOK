package saimDayByDay.day47_CystomClassArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Item firstItem = new Item("Apples", 5, 1.33);
        firstItem.quantity += 5;
        firstItem.calculatePrice();
        System.out.println(firstItem);

        String keepGoing = "yes";
        ArrayList<Item> shoppingList = new ArrayList<>();

        while (keepGoing.equalsIgnoreCase("yes")){

            System.out.println("What is the item name?");
            String name = input.nextLine();

            System.out.println("What is the quantity?");
            int quantity = input.nextInt();

            System.out.println("What is the unit price?");
            double unitPrice = input.nextDouble();

            Item item = new Item(name, quantity, unitPrice);
            shoppingList.add(item);

            System.out.println("Do you want to keep adding Items?");
            input.nextLine(); // empty enter input

            keepGoing = input.nextLine();

        }

        System.out.println("\nShopping List:");
        System.out.println(shoppingList);




    }


}