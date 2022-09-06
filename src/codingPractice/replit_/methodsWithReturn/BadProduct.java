package codingPractice.replit_.methodsWithReturn;

import java.util.Scanner;

public class BadProduct {

public static boolean badP(int [] products, int limit){


    int numberOfBad = 0 ;

    for(int each : products){

        if(each == 0 ){

            numberOfBad++;

        }
    }
    if(numberOfBad >= limit){

        return false;

    }else{

        return true;

    }

}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();

        System.out.println(badP(nums, limit));
    }

}
/*
All products that go into the warehouse go through a machine that checks if they are intact. To declare if the products shipment was good or bad it also gets a limited number of how many products can be broken for it to be considered a good shipment.

badP is a method that gets an int array named products and an int named limit.

products(int[]) - is an int array representing the products it checked, if the item is intact it will be represented by 1 if its broken its 0. for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.

limit(int) - represents the max amount of broken items for this shipment to be considered good (and the method returns true) for example : products [1,1,1,1,0] limit:3, there is only 1 broken product and its less then the limit (3) return true.

Examples:

badP([1,1,1,1],5)

returns true

badP([1,1,1,1,0,0,0,0],2)

returns false

badP([1,1,0,0],2)

returns false

badP([1,1,1,0],6)

returns true

hint:

create a counter, loop the products, increment it for each 0 you find. finally compare counter to limit and return true or false
 */