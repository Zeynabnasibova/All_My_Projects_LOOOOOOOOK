package saimDayByDay.day48_Static;

public class BestBuyStores {

    public static void main(String[] args) {


        BestBuy storeOne = new BestBuy("Main St");

        BestBuy storeTwo = new BestBuy("Oak Drive");

        System.out.println(storeOne.location);
        System.out.println(storeTwo.location);
        // System.out.println(BestBuy.location);

        System.out.println(BestBuy.day);
        System.out.println(storeOne.day);
        System.out.println(storeTwo.day);

        BestBuy.day = "Sunday";
        // storeOne.day = "Sunday";
        // storeTwo.day = "Sunday";

        // lines 18, 19, 20 all would change the day variable

        System.out.println(BestBuy.day);
        System.out.println(storeOne.day);
        System.out.println(storeTwo.day);

        System.out.println(BestBuy.headquarters);

    }
}