package saimDayByDay.day47_CystomClassArrayList;

public class Item {



    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Item(String name){
        this.name = name;
    }

    public Item(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }


    public void calculatePrice(){
        totalPrice = quantity * unitPrice;
    }

    public String toString(){
        return "ITEM: " + name + " | Quantity: " + quantity + " | Total Price: $" + totalPrice;
    }

}

/*
Item
	create class called Item
		data:
			name, quantity, unit price, total price
		constructor:
			- all the instance variables are initialized
			- only sets up name
		method:
			toString: print the information
			calculate total price: quantity * unit price = total price
				-> how to calculate when the object is create with all the information
 */